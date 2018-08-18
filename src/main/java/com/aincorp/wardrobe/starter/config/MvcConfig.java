package com.aincorp.wardrobe.starter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.aincorp.wardrobe.starter")
public class MvcConfig implements WebMvcConfigurer {


}
