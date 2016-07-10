package com.dudream.mq.processor.dao;

import com.dudream.mq.processor.model.Demo;

public interface DemoDao {

    int addDemo(Demo demo);

    Demo getDemo(Integer id);

}
