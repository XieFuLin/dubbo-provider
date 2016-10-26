package com.xfl.provider.impl;

import com.xfl.provider.service.IDemoService;

/**
 * Created by XFL.
 * time on 2016/10/26 21:20
 * description: dubbo服务实现类
 */
public class DemoServiceImpl implements IDemoService {
    /**
     * 测试样例.
     *
     * @param name 测试参数name
     * @return String 返回类型字符串
     */
    @Override
    public String sayHello(String name) {
        return name + "Hello!";
    }
}
