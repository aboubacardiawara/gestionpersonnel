package com.springproject.gestionemploye;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix="com.springproject.gestionemploye")
public class CustomProperties {
    private String apiUrl;
}
