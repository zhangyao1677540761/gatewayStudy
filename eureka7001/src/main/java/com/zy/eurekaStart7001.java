package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @学习小结
 */
@SpringBootApplication
@EnableEurekaServer   //开启eureka服务
public class eurekaStart7001 {
    public static void main(String[] args) {
        SpringApplication.run(eurekaStart7001.class,args);
    }
}