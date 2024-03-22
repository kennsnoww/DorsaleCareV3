package com.isge.DorsalCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DorsalCareApplication {

	public static void main(String[] args) {
		SpringApplication.run(DorsalCareApplication.class, args);
	}

	@Configuration
	public class AppConfig {

		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();
		}
	}



}
