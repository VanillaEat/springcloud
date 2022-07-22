package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 * 第一个REST接口？
 *
 * 发现没有：写好@RestControler（返回Json格式）  这个类名就亮了 意思就是用到了    写好    @GetMapping("hello")【这个就是@RequestMapping(method=RequestMethod.GET)】    这个方法名就亮了
 *
 * @author: scott
 * @date: 2022年07月22日 14:25
 */

@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello() {
//        System.out.println("第一个REST接口生效");

        return "hello";
    }
}
