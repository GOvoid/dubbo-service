package com.sogou.frontweb.dubbo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiangweiqun on 2016/9/19.
 */

public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();

        System.in.read(); // Ϊ��֤����һֱ���ţ�������������������ģ��
    }

}
