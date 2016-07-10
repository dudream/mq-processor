package com.dudream.mq.rabbit;

import com.dudream.mq.processor.framework.amqp.MessageProducer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * 生产者，模拟向mq中发送消息
 */
public class ProducerTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ctx-mq-producer.xml");
        MessageProducer messageProducer = ctx.getBean(MessageProducer.class);

        Map<String, String> bizBody = new HashMap<String, String>();
        bizBody.put("name", "abc");
        messageProducer.publishMessage("demo", bizBody);
    }

}
