package net.skhu.viewgorithm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ViewgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViewgorithmApplication.class, args);
    }

}
