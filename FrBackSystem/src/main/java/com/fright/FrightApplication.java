package com.fright;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by szty on 2018/6/19.
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class FrightApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrightApplication.class, args);
    }
}
