package com.example.SpringWebMavenDemo.controller.security;

import com.example.SpringWebMavenDemo.entity.security.appuser.AppUser;
import com.example.SpringWebMavenDemo.repository.security.appuser.AppUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initUsers(AppUserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            createUserIfNotExists(userRepository, passwordEncoder,
                    "admin", "password123", "ROLE_ADMIN");

            createUserIfNotExists(userRepository, passwordEncoder,
                    "manager", "password123", "ROLE_MANAGER");

            createUserIfNotExists(userRepository, passwordEncoder,
                    "employee", "password123", "ROLE_EMPLOYEE");
        };
    }

    private void createUserIfNotExists(AppUserRepository repo,
                                       PasswordEncoder encoder,
                                       String username,
                                       String rawPassword,
                                       String role) {
        repo.findByUsername(username).ifPresentOrElse(
                u -> System.out.println("User " + username + " already exists"),
                () -> {
                    AppUser user = new AppUser();
                    user.setUsername(username);
                    user.setPassword(encoder.encode(rawPassword));
                    user.setRoles(role);
                    repo.save(user);
                    System.out.println("Created user: " + username + " with role: " + role);
                }
        );
    }
}
