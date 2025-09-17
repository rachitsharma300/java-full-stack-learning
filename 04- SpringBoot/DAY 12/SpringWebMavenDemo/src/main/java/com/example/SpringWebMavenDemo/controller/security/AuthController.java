package com.example.SpringWebMavenDemo.controller.security;

import com.example.SpringWebMavenDemo.config.JwtUtils;
import com.example.SpringWebMavenDemo.service.security.CustomUserDetailsService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authManager;
    private final JwtUtils jwtUtils;
    private final CustomUserDetailsService userDetailsService;

    public AuthController(AuthenticationManager authManager, JwtUtils jwtUtils, CustomUserDetailsService uds) {
        this.authManager = authManager;
        this.jwtUtils = jwtUtils;
        this.userDetailsService = uds;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.username(), request.password())
        );

        UserDetails ud = (UserDetails) auth.getPrincipal();
        String token = jwtUtils.generateJwtToken(ud);

        return ResponseEntity.ok(new JwtResponse(token));
    }
}

// DTOs:
record LoginRequest(String username, String password) {}
record JwtResponse(String token) {}
