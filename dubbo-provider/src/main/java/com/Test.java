package com;

import com.sun.management.jmx.TraceNotification;
import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author yangmingkai
 * @ClassName Test
 * @Description TODO
 * @date 2018/10/22 9:56 PM
 **/
public class Test {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);//打印abc
        change(str);
        System.out.println(str);;//打印abc
    }

    public static void  change (String str){
        str = "def";
    }
}

