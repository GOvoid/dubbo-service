package com.sogou.frontweb.dubbo.provider;

/**
 * Created by jiangweiqun on 2016/9/19.
 */

import com.sogou.frontweb.dubbo.api.DemoService;
import com.sogou.frontweb.dubbo.api.User;

import java.util.ArrayList;
import java.util.List;

public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("jack");
        u1.setAge(20);
        u1.setSex("ÄÐ");

        User u2 = new User();
        u2.setName("tom");
        u2.setAge(21);
        u2.setSex("Å®");

        User u3 = new User();
        u3.setName("rose");
        u3.setAge(19);
        u3.setSex("Å®");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        return list;
    }
}
