package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yangmingkailoadbalance
 * @ClassName ConsumerApplication
 * @Description TODO
 * @date 2018/10/22 4:58 PM
 **/
@SpringBootApplication
@ImportResource({"classpath:dubbo-consumer.xml"})
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
