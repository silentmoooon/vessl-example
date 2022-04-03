package org.vessl.test.service;

import org.vessl.core.bean.Bean;

@Bean
public class ServiceA implements IService{
    @Override
    public String name() {
        return "serviceA";
    }
}
