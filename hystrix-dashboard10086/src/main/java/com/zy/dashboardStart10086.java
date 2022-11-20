package com.zy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @学习小结
 */
@EnableHystrixDashboard//开启仪表盘功能
//http://localhost:9001/hystrix
@SpringBootApplication
public class dashboardStart10086 {

    public static void main(String[] args) {
        SpringApplication.run(dashboardStart10086.class, args);
    }







}