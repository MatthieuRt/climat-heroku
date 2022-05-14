package com.example.climatheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ClimatHerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClimatHerokuApplication.class, args);
    }

}
