package com.mumu.myspringboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 * 类型安全的配置(基于properties文件)
 * @ConfigurationProperties主要作用：就是绑定application.properties中的属性
 * 它一般和Component一起使用，或者点豆豆@Bean的方式来进行使用。
 * @ConfigurationProperties(prefix = "author") 的注入值得方式是setter注入得。
 */

@Component
@ConfigurationProperties(prefix = "author")
public class MyBean1 {

    private String name;

    private Long age;

    //这里不用@Value注入，所以要加getter,setter? 一会去掉试试即可。
    // 测试之后，发现还必须要setter进行注入的。
    //结论：ConfigurationProperties 是需要setter进行注入的。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
