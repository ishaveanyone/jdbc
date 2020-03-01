/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-01-07 16:49
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package com.dist.tomcatjdbc;


import org.apache.tomcat.jdbc.pool.DataSourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource tomcatdbcp(){
        return new org.apache.tomcat.jdbc.pool.DataSource();
    }
}
