package com.zjy.springclou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: com.zjy.springcloud
 * @description: Main
 * @author: Zjy
 * @create: 2020-07-01 11:17
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMain8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMain8801.class,args);
    }
}
