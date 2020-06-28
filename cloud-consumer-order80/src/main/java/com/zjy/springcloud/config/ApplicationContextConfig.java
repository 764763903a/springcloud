package com.zjy.springcloud.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: com.zjy.springcloud
 * @description: Config
 * @author: Zjy
 * @create: 2020-06-16 20:17
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
//    @LoadBalanced   //负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
