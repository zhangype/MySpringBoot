package com.zhangype.myboot.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 队列配置
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/12/28
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

}