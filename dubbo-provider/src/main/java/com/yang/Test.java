package com.yang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yangmingkai
 * @ClassName Test
 * @Description TODO
 * @date 2018/10/22 5:37 PM
 **/
public class Test {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"classpath:/dubbo-provider.xml"});
        context.start();
        System.in.read();
    }
}
