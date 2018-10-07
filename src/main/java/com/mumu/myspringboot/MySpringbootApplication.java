package com.mumu.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication //开启自动配置。
public class MySpringbootApplication {

    //项目启动的入口。如果有偏爱icon ,把favicon.ico 文件丢到resources 根目录下即可。注意：文件名不可变。
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class, args);
    }
}
