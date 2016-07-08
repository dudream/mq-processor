package com.dudream.mq.processor.framework;

import com.dudream.mq.processor.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx-processor.xml");

        DemoService service = ctx.getBean(DemoService.class);

        System.out.println(service.getDemo(1).getName());
    }



}
