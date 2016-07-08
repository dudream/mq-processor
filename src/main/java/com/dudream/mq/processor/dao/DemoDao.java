package com.dudream.mq.processor.dao;

import com.dudream.mq.processor.model.Demo;

public interface DemoDao {

    public int addDemo(Demo demo);

    public Demo getDemo(Integer id);

}
