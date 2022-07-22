package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 功能描述
 * springboot启动类
 * 发现没有：一个web项目依靠springboot框架一分钟搭好。内嵌web容器tomcat，可替换。
 *
 *
 * @author: scott
 * @date: 2022年07月21日 13:44
 */

@SpringBootApplication
@EnableAsync
public class App {
public static void main(String[] args){
    SpringApplication.run(App.class,args);
}

}
