package org.vessl.test.service;

import org.vessl.core.bean.Bean;
import org.vessl.core.bean.Inject;
import org.vessl.core.bean.config.Value;
import org.vessl.test.aop.TestLog;
import org.vessl.test.bean.TestBean;
import org.vessl.test.dao.TestMapper;

import java.util.List;
import java.util.Map;

@Bean
public class TestServer {

    @Inject
    private TestMapper testMapper;

    @Inject
    private List<IService> services;

    @Inject
    private Map<String, IService> serviceMap;

    @Value("${aa.dd:11}")
    private String test;

    @TestLog
    public List<TestBean> getName() {
        List<TestBean> testBeans = testMapper.selectTest();
        System.out.println(testBeans);
        Long i = testMapper.selectCount();
        System.out.println(i);
        System.out.println("test");
        System.out.println(test);
        System.out.println("\nmap");
        serviceMap.forEach((s, testAbsMapper) -> {
            System.out.println(s);
            System.out.println(testAbsMapper.name());
        });
        System.out.println("\nlist");
        services.forEach((testAbsMapper) -> {
            System.out.println(testAbsMapper.name());
        });
        return testBeans;
    }


}
