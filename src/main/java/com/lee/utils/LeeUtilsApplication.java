package com.lee.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Lee Utils 微服务启动类
 *
 * @author lee
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LeeUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeeUtilsApplication.class, args);
    }

}
