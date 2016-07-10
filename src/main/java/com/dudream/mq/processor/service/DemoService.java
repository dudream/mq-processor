package com.dudream.mq.processor.service;

import com.dudream.mq.processor.model.Demo;

public interface DemoService {

    void addDemo(Demo demo);

    Demo getDemo(Integer id);

}
