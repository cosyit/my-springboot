package com.mumu.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/*
 RestController == ResponseBody + Controller注解。
 @ResponseBody :
  将返回的结果直接写入到 HTTP的响应的body正文中 ,一般在异步获取数据时使用。
  该注解用于将Controller中的方法返回的对象通过适当的HttpMessageConverter转换为指定的
  格式后，写入到http响应的body正文中。

  另外还有一个注解 @RequestBody 则是将HTTP请求body正文的数据插入到方法中，
  使用适合的HttpMessageConverter 将请求体写入到某个对象。
 */
@RestController
@SpringBootApplication //开启自动配置。
public class MySpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class, args);
    }
}
