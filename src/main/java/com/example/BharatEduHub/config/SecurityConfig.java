//package com.example.BharatEduHub.config;
//
//
//import jakarta.servlet.annotation.WebServlet;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.access.intercept.AuthorizationFilter;
//import org.springframework.security.web.authentication.AuthenticationFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;
//
//@Configuration
//@EnableMethodSecurity
//public class SecurityConfig {
//
//
//
////    @Bean
////    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        return http.csrf(csrf -> csrf.disable())
////                .authorizeRequests()
////                .requestMatchers(HttpMethod.POST,"/bharateduhub/authenticate").permitAll()
////                .requestMatchers(new AntPathRequestMatcher("/h2-console/**")).permitAll()
////                .and()
////
////                .authorizeRequests().requestMatchers(HttpMethod.POST,"/bharateduhub/**")
////                .authenticated().and().build();
////
////    }
//
////    @Bean
////    @Order(1)
////    SecurityFilterChain h2ConsoleSecurityFilterChain(HttpSecurity http) throws Exception {
////        return http
////                .securityMatcher(AntPathRequestMatcher.antMatcher("/h2-console/**"))
////                .authorizeHttpRequests( auth -> {
////                    auth.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")).permitAll();
////                })
////                .csrf(csrf -> csrf.ignoringRequestMatchers(AntPathRequestMatcher.antMatcher("/h2-console/**")))
////                .build();
////    }
////    @Bean
//////    @Order(2)
////    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        return http.csrf(csrf -> csrf.disable())
////                .authorizeRequests()
////                .requestMatchers(HttpMethod.POST,"/bharateduhub/authenticate").permitAll()
////                .requestMatchers(HttpMethod.GET, "/h2-console/**").permitAll()
////                .requestMatchers(HttpMethod.POST,"/bharateduhub/**")
////                .authenticated().and().build();
////    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http.csrf(csrf -> csrf.disable())
//                .exceptionHandling(handling -> handling.authenticationEntryPoint(new))
//                .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .authorizeHttpRequests(request -> {
//                    request
//                            .requestMatchers(antMatcher("/bharateduhub/**")).permitAll().anyRequest().authenticated();
//                }).build();
//    }
//
//
//}
//
//
