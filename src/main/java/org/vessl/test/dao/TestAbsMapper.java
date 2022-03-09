package org.vessl.test.dao;

import org.vessl.sql.annotation.Mapper;
import org.vessl.sql.annotation.Name;
import org.vessl.sql.annotation.Sql;
import org.vessl.test.bean.TestBean;
import org.vessl.test.aop.TestLog;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public  abstract class TestAbsMapper {

    @Sql(value = "select * from test")
    @TestLog
    public abstract   List<TestBean> select();

    @Sql(value = "select * from test where name={name}")

    public abstract List<TestBean> selectByName(@Name("name") String name);

    public abstract int insert(@Name("bean") TestBean testBean, @Name("addTime") LocalDateTime dateTime);
}
