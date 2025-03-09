package com.demo.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception{

        httpSecurity.authorizeHttpRequests(auth->auth.requestMatchers("/emp/greet")
                .permitAll().anyRequest().hasRole("USER"));
        httpSecurity.httpBasic(Customizer.withDefaults()).csrf(Customizer.withDefaults());

        return httpSecurity.build();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager authManager= new InMemoryUserDetailsManager();
            authManager.createUser(User.withUsername("shantanu").password(bCryptPasswordEncoder().encode("welcome1")).roles("USER").build());
        authManager.createUser(User.withUsername("pavan").password(bCryptPasswordEncoder().encode("welcome1")).roles("ADMIN").build());
        authManager.createUser(User.withUsername("kiran").password(bCryptPasswordEncoder().encode("welcome1")).roles("USER").build());
   return authManager;
    }
}
