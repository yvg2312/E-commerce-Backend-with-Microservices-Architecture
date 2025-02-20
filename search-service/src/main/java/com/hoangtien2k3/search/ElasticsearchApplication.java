package com.hoangtien2k3.search;

import com.hoangtien2k3.search.config.ServiceUrlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@EnableConfigurationProperties(ServiceUrlConfig.class)
@SpringBootApplication
@Configuration
public class ElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchApplication.class, args);
    }
}
