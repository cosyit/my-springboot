package com.mumu.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RestController;

/*
 知识点1：认识 @SpringBootApplication  注解
 点击进入看源码
@Target({ElementType.TYPE}) 修饰.class类型如:【接口，enum，类，注解等上】。
@Retention(RetentionPolicy.RUNTIME) //jvm会载入到运行时
@Documented //做归档处理。
@Inherited // 子类可继承。
@SpringBootConfiguration //

@EnableAutoConfiguration ：↓
  会自动的让springboot 根据类路径中的jar包依赖 为我们当前的项目 进行自动配置
  比如：添加了spring-boot-starter-web依赖的话，EnableAutoConfiguration 会
  自动添加tomcat 和 Spring MVC的依赖，springboot 会自动对 这2个系统的jar进行
  自动的配置。总之一句话：自动地配置 starter模块所依赖的jar包。
  又比如：添加spring-boot-starter-data-jpa 依赖，spirngboot会自动配置JPA相关的配置。


@ComponentScan(
    excludeFilters = {@Filter(
    type = FilterType.CUSTOM,
    classes = {TypeExcludeFilter.class}
), @Filter(
    type = FilterType.CUSTOM,
    classes = {AutoConfigurationExcludeFilter.class}
)}
)
 */


/*
 B级知识点1[无额外说明的都是常用A级知识点。]：
 @ImportResource({"classpath:someOther-context1.xml","classpath:someOther-context2.xml"})
 springboot 提倡零配置，如果实际项目中确实需要使用xml配置，我们可以使用@ImportResource注解来加载xml.

 知识点2：springboot 基于jar包运行的，已打成jar包的程序可以直接使用
 java -jar   某某.jar  来运行。
 或者  java -jar xx.jar --server.port=9191 来修改tomcat的端口号。


 知识点3：https://www.cnblogs.com/winner-0715/p/6666579.html springboot 的热部署。
 */
@SpringBootApplication //开启自动配置。建议入口的位置，就在现在的所在的包位置。
public class MySpringbootApplication {

    //标准的Java项目启动入口。
    public static void main(String[] args) {
        SpringApplication.run(MySpringbootApplication.class, args);
    }
}
