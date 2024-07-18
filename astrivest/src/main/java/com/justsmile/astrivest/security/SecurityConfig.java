package com.justsmile.astrivest.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(final HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests.requestMatchers("/", "/index").permitAll() // 인증 없이 접근 허용할 URL
                                .anyRequest().authenticated() // 다른 모든 요청은 인증 필요
                )
                .formLogin(formLogin -> formLogin.loginPage("/login").permitAll())
                .logout(LogoutConfigurer::permitAll)
                .build();
    }
}
