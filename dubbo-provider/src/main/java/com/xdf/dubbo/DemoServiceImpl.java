package com.xdf.dubbo;

import org.springframework.stereotype.Service;

/**
 * Created by guxinxin on 2018/8/1.
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String getName(String name) {
        return name;
    }
}
