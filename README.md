# Documentation de l'API DorsalCare

Ce dépôt contient le code backend du projet DorsalCare, se concentrant spécifiquement sur la gestion des utilisateurs et des corrections. Vous trouverez ci-dessous des détails sur les principaux composants, les points d'extrémité et les fonctionnalités de cette API. ce code été tester exclusivement avec ## Swagger

## CorrectionController

Le `CorrectionController` gère les opérations CRUD liées aux corrections.

### Points d'extrémité

- **GET** `/api/corrections/`: Récupérer toutes les corrections.
- **POST** `/api/corrections/`: Créer une nouvelle correction.
- **GET** `/api/corrections/{id}`: Obtenir une correction par ID.
- **PUT** `/api/corrections/{id}`: Mettre à jour une correction par ID.
- **DELETE** `/api/corrections/{id}`: Supprimer une correction par ID.
- **GET** `/api/corrections/byDateRange`: Récupérer les corrections par plage de dates.

  ## Paramètres pour /byDateRange
- userId: `Long` (ID de l'utilisateur)
- startDate: `Date` (Date de début de la plage au format ISO)
- endDate: `Date` (Date de fin de la plage au format ISO)

## UserController

Le `UserController` gère les opérations liées aux utilisateurs.

### Points d'extrémité

- **POST** `/api/users/`: Créer un nouvel utilisateur.
- **GET** `/api/users/{id}`: Obtenir un utilisateur par ID.
- **GET** `/api/users/`: Obtenir tous les utilisateurs.
- **PUT** `/api/users/{id}`: Mettre à jour un utilisateur par ID.
- **DELETE** `/api/users/{id}`: Supprimer un utilisateur par ID.

## DTOs

### CorrectionDTO

- `id`: Long
- `value`: double
- `date`: Date
- `userId`: Long (référence à l'utilisateur)

### UserDTO

- `id`: Long
- `firstName`: String
- `lastName`: String
- `email`: String
- `role`: String
- `password`: String
- `corrections`: List<CorrectionDTO>

## Modèles

### Correction

Représente une correction effectuée par un utilisateur.

### Users

Représente un utilisateur dans le système.

## Services

### CorrectionService

- `createCorrection(userId, correctionDTO)`: Crée une correction pour un utilisateur.
- `getAllCorrectionsByUserId(userId)`: Récupère toutes les corrections pour un utilisateur.
- `deleteCorrection(id)`: Supprime une correction par ID.

### UserService

- `createUser(userDTO)`: Crée un nouvel utilisateur.
- `updateUser(id, userDTO)`: Met à jour un utilisateur par ID.
- `getUserById(id)`: Récupère un utilisateur par ID.
- `deleteUser(id)`: Supprime un utilisateur par ID.
- `getAllUsers()`: Récupère tous les utilisateurs.

## Repositories

### CorrectionRepository

Gère les opérations de base de données liées aux corrections.

### UserRepository

Gère les opérations de base de données liées aux utilisateurs.

## Sécurité

L'application implémente Spring Security pour l'authentification et l'autorisation des utilisateurs.

## Utilisation

Pour utiliser cette API, effectuez des requêtes HTTP aux Endpoints spécifiés en utilisant les méthodes appropriées (GET, POST, PUT, DELETE). Assurez-vous d'avoir les informations d'authentification correctes pour accéder aux points d'extrémité sécurisés.

Pour plus d'informations et des directives d'utilisation détaillées, consultez le code source et la documentation associée.

---

Ce README fournit un aperçu des composants clés et des fonctionnalités de l'API DorsalCare. Pour des détails d'implémentation et des instructions d'utilisation détaillées, veuillez vous référer au code source.
