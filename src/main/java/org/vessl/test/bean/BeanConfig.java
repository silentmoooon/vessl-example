package org.vessl.test.bean;

import org.vessl.core.bean.Bean;
import org.vessl.core.bean.config.Value;
import org.vessl.sql.bean.SqlConfig;

@Bean
public class BeanConfig {
    @Value("${sql.jdbcUrl:}")
    private String jdbcUrl;
    @Value("${sql.username:}")
    private String username;
    @Value("${sql.password:}")
    private String password;
    @Value("${sql.cachePrepStmts:true}")
    private String cachePrepStmts;
    @Value("${sql.prepStmtCacheSize:250}")
    private String prepStmtCacheSize;
    @Value("${sql.prepStmtCacheSqlLimit:2048}")
    private String prepStmtCacheSqlLimit;

    @Bean
    public SqlConfig sqlConfig(){
        SqlConfig sqlConfig = new SqlConfig();
        sqlConfig.setBasePackage("org.vessl.test");
        sqlConfig.setDatasourceName("test");
        sqlConfig.setJdbcUrl(jdbcUrl);
        sqlConfig.setUsername(username);
        sqlConfig.setPassword(password);
        sqlConfig.setCachePrepStmts(cachePrepStmts);
        sqlConfig.setPrepStmtCacheSize(prepStmtCacheSize);
        sqlConfig.setPrepStmtCacheSqlLimit(prepStmtCacheSqlLimit);
        return sqlConfig;
    }

}
