package com.siemens.csds.sso;

import java.util.TimeZone;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import javax.servlet.ServletContext;
@Slf4j
@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = {"com.siemens"})
public class SSOApplication extends SpringBootServletInitializer implements ApplicationRunner {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SSOApplication.class);
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(SSOApplication.class, args);

    }

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}