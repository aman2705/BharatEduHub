package com.example.BharatEduHub.config;

import com.example.BharatEduHub.filter.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf()
//                .disable()
//                .authorizeRequests()
//                .antMatchers("/authenticate")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf()
                .disable()
                .authorizeHttpRequests()
                .requestMatchers("/products/welcome","/products/new").permitAll()
                .and()
                .authorizeHttpRequests().
                requestMatchers("/products/**")
                .authenticated().and().formLogin().and().build();
    }

}


