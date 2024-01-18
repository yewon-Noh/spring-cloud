package com.example.apigatewayservice.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    /*
    // 자바코드로 gateway 구현
    @Bean
    public RouteLocator firstServiceRoute(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("first-service", r -> r.path("/first-service/**")
                        .uri("http://localhost:8081"))
                .route("second-service", r -> r.path("/second-service/**")
                        .filters(f -> f.addRequestHeader("second-request", "second-request-header")
                                        .addResponseHeader("second-response", "second-response-header"))
                        .uri("http://localhost:8082"))
                .build();
    }
    */
}
