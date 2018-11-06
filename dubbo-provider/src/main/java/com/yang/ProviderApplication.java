package com.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.io.IOException;

/**
 * @author yangmingkai
 * @ClassName ProviderApplication
 * @Description TODO
 * @date 2018/10/22 4:53 PM
 **/

@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
