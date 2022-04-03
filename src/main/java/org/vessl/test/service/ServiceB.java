package org.vessl.test.service;

import org.vessl.core.bean.Bean;

@Bean
public class ServiceB implements IService{
    @Override
    public String name() {
        return "serviceB";
    }
}
