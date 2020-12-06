package me.summerbell.demospringaop.springAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringAopApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoSpringAopApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);
    }

}
