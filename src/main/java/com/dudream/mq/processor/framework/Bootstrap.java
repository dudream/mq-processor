package com.dudream.mq.processor.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动程序
 */
public class Bootstrap {

    private static final Logger LOG = LoggerFactory.getLogger(Bootstrap.class);

    public void start() throws Exception {
        LOG.info("Processor.start()");
        new ClassPathXmlApplicationContext(new String[] { "ctx-processor.xml" });
        LOG.info("Processor.start() end");
    }

    public void run() throws InterruptedException {
        while (true) {
            Thread.sleep(Long.MAX_VALUE);
        }
    }

    public static void main(String[] args) {
        LOG.info("Processor starting...");
        Bootstrap m = new Bootstrap();
        try {
            m.start();
            m.run();
            LOG.info("Processor started.");
        } catch (Exception e) {
            LOG.error("Processor start error ", e);
        }
    }

}
