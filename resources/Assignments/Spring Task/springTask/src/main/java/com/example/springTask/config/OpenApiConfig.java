package com.example.springTask.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenAPI / Swagger configuration.
 * This class configure Swagger UI
 * More Helpful for testing APIs on UI
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI employeeApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Employee API")
                        .description("REST API for Employee CRUD using Spring Boot + MongoDB")
                        .version("v1"));
    }
}
