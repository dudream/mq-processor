package com.dudream.mq.processor.framework.task;

import com.dudream.mq.processor.framework.amqp.AbstractConsumerTask;
import com.dudream.mq.processor.model.Demo;
import com.dudream.mq.processor.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * 消息消费者任务DemoTask
 */
public class DemoTask extends AbstractConsumerTask {

    private static final Logger LOG = LoggerFactory.getLogger(Demo.class);

    @Autowired
    private DemoService demoService;

    /**
     * 处理业务：根据消息中的name字段插入DB的Demo表
     */
    @Override
    protected boolean doBiz(Map<String, String> bizBody) throws Exception {
        if (bizBody.containsKey("name")) {
            Demo demo = new Demo();
            demo.setName(bizBody.get("name"));
            demoService.addDemo(demo);
        }
        return true;
    }

}
