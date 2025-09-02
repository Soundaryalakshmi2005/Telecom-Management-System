package com.tims.config; // <-- keep your actual package name

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // ✅ restrict only to API endpoints
                        .allowedOrigins(
                                "http://localhost:8081",
                                "http://127.0.0.1:5500",
                                "http://localhost:5500"
                        )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // ✅ all required HTTP methods
                        .allowedHeaders("*")  // ✅ allow all headers
                        .exposedHeaders("Authorization", "Content-Type") // ✅ optional, expose needed headers
                        .allowCredentials(true); // ✅ allow cookies if needed
            }
        };
    }
}
