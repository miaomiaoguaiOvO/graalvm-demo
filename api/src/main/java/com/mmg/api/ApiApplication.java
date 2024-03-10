package com.mmg.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mmg.api", "com.mmg.common"})
@MapperScan(basePackages = {"com.mmg.common.mapper"}, sqlSessionTemplateRef = "sqlSessionTemplate")
public class ApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
