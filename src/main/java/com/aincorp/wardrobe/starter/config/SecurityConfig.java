package com.aincorp.wardrobe.starter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

@Configuration
@ComponentScan("com.aincorp.wardrobe.starter")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean(name = "encoder")
    public SCryptPasswordEncoder sCryptPasswordEncoder() {
        SCryptPasswordEncoder encoder = new SCryptPasswordEncoder();
        return encoder;
    }

    @Bean(name = "authenticationManager")
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

}
