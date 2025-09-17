package com.example.SpringWebMavenDemo.entity.security.appuser;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "app_users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password; // stored encoded

    // comma separated roles e.g. "ROLE_USER,ROLE_ADMIN"
    private String roles;
}