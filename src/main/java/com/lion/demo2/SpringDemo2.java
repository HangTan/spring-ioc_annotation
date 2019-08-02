package com.lion.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {

    @Test
    public void demo1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean1 bean1 = (Bean1)applicationContext.getBean("bean1");

        bean1.say();

        applicationContext.close();
    }

    @Test
    public void demo2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean2 bean2_1 = (Bean2)applicationContext.getBean("bean2");
        Bean2 bean2_2 = (Bean2)applicationContext.getBean("bean2");

        System.out.println(bean2_1 == bean2_2);


    }
}
