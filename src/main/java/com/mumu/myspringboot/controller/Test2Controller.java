package com.mumu.myspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@PropertySource(value= {"classpath:commons.properties"},ignoreResourceNotFound=false,encoding="UTF-8",name="commons.properties")
public class Test2Controller {
    //因为是用spring 去取配置文件，SpringExpression可以用类似于EL表达式的${key}的方式来取。

    @Value("${book.author}")
    private String bookAuthor;

    @Value("${book.name}")
    private String bookName;

    @Value("${book.words}")
    private String text;

    @RequestMapping("/commons")
    String index(){
        return bookName+ ":"+text+" by "+bookAuthor;
    }

}
