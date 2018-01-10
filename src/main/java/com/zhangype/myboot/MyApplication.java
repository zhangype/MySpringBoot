package com.zhangype.myboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用启动类
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/11/23
 */
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = "com.zhangype")
@MapperScan("com.zhangype.myboot.modules.**.mapper")
public class MyApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }

}
