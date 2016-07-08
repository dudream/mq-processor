package com.dudream.mq.processor.service.impl;

import com.dudream.mq.processor.dao.DemoDao;
import com.dudream.mq.processor.model.Demo;
import com.dudream.mq.processor.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    public void addDemo(Demo demo) {
        demoDao.addDemo(demo);
    }

    public Demo getDemo(Integer id) {
        return demoDao.getDemo(id);
    }

}
