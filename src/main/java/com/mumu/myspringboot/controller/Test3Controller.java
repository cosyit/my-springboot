package com.mumu.myspringboot.controller;

import com.mumu.myspringboot.bean.MyBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类型安全的配置(基于properties文件)
 */

@RestController
public class Test3Controller {

    @Autowired
    private MyBean1 myBean1;

    @RequestMapping("/typeSafe")
    public String index(){
        return myBean1.getName() + "," + myBean1.getAge();
    }

}
