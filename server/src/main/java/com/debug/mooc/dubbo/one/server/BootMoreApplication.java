package com.debug.mooc.dubbo.one.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml","classpath:spring/spring-dubbo.xml"})
/*@MapperScan(basePackages = "com.debug.mooc.dubbo.one.model.mapper")*/
public class BootMoreApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootMoreApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BootMoreApplication.class, args);
    }

}