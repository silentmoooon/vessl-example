package org.vessl.test.service;

import org.vessl.base.bean.Bean;
import org.vessl.base.bean.Inject;
import org.vessl.base.bean.config.Value;
import org.vessl.test.aop.TestLog;
import org.vessl.test.bean.TestBean;
import org.vessl.test.dao.TestAbsMapper;
import org.vessl.test.dao.TestMapper;

import java.util.List;
import java.util.Map;

@Bean
public class TestServer {

    @Inject
    private TestMapper testMapper;

    @Inject
    private List<TestAbsMapper> testAbsMappers;

    @Inject
    private Map<String, TestAbsMapper> testAbsMapperMap;

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
        testAbsMapperMap.forEach((s, testAbsMapper) -> {
            System.out.println(s);
            System.out.println(testAbsMapper.select());
        });
        System.out.println("\nlist");
        testAbsMappers.forEach((testAbsMapper) -> {
            System.out.println(testAbsMapper.select());
        });
        return testBeans;
    }


}
