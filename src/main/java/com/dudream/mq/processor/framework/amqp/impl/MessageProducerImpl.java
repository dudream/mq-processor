package com.dudream.mq.processor.framework.amqp.impl;

import com.dudream.mq.processor.framework.amqp.MessageProducer;
import com.dudream.mq.processor.framework.amqp.MqMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * 消息生产者实现类
 */
public class MessageProducerImpl implements MessageProducer {

    private RabbitTemplate rabbitTemplate;

    @Override
    public void publishMessage(String queue, Map<String, String> bizBody) {
        MqMessage mqMessage = new MqMessage(bizBody);
        mqMessage.setId(UUID.randomUUID().toString());
        mqMessage.setQueueName(queue);
        mqMessage.setPublishedTime(new Date());
        rabbitTemplate.convertAndSend(queue, mqMessage);
    }

    public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

}
