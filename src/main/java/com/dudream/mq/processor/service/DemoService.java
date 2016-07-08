package com.dudream.mq.processor.service;

import com.dudream.mq.processor.model.Demo;

public interface DemoService {

    public void addDemo(Demo demo);

    public Demo getDemo(Integer id);

}
