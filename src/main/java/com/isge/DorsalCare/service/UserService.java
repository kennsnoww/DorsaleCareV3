package com.isge.DorsalCare.service;
import com.isge.DorsalCare.dto.UserDTO;
import java.util.List;

public interface UserService {

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(Long id, UserDTO userDTO);

    UserDTO getUserById(Long id);

    void deleteUser(Long id);

    List<UserDTO> getAllUsers();
}
