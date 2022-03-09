package org.vessl.test.dao;

import org.vessl.sql.annotation.Mapper;
import org.vessl.sql.annotation.Name;
import org.vessl.sql.annotation.Sql;
import org.vessl.test.bean.TestBean;
import org.vessl.test.aop.TestLog;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface TestMapper {

    @Sql(value = "select * from test")
    public List<TestBean> selectTest();
    @Sql(value = "select age from test where id=1")
    public long selectCount();

    @Sql(value = "select * from test where name={name}")
    @TestLog
    public List<TestBean> selectByName(@Name("name") String name);

    public int insert(@Name("bean") TestBean testBean, @Name("addTime") LocalDateTime dateTime);
}
