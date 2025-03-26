/*
package com.oceanprobe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/probe/move").authenticated()
                .antMatchers("/probe/**").permitAll()
                .and()
                .httpBasic();  // Temporary for testing

        return http.build();
    }
}

*/
