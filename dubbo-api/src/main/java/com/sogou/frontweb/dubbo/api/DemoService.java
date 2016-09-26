package com.sogou.frontweb.dubbo.api;

/**
 * Created by jiangweiqun on 2016/9/19.
 */

import java.util.List;

public interface DemoService {

    String sayHello(String name);

    public List getUsers();

}
