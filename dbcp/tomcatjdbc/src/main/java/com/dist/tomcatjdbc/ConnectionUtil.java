/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-24 15:57
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package com.dist.tomcatjdbc;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.PoolProperties;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionUtil {

    public static void main(String[] args) throws Exception {
        PoolProperties p = new PoolProperties();
        p.setUrl("jdbc:postgresql://127.0.0.1:5432/xuppdb?currentSchema=public");
        p.setDriverClassName("org.postgresql.Driver");
        p.setUsername("xupp");
        p.setPassword("pass");
        p.setJmxEnabled(true);
        p.setTestWhileIdle(false);
        p.setTestOnBorrow(true);
        p.setValidationQuery("SELECT version();");
        p.setTestOnReturn(false);
        p.setValidationInterval(30000);
        p.setTimeBetweenEvictionRunsMillis(30000);
        p.setMaxActive(100);
        p.setInitialSize(10);
        p.setMaxWait(10000);
        p.setRemoveAbandonedTimeout(60);
        p.setMinEvictableIdleTimeMillis(30000);
        p.setMinIdle(10);
        p.setLogAbandoned(true);
        p.setRemoveAbandoned(true);
        p.setJdbcInterceptors(
                "org.apache.tomcat.jdbc.pool.interceptor.ConnectionState;"+
                        "org.apache.tomcat.jdbc.pool.interceptor.StatementFinalizer");
        DataSource datasource = new DataSource();
        datasource.setPoolProperties(p);

        Connection con = null;
        try {
            con = datasource.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from test");

            while (rs.next()) {
                System.out.println(rs.getInt("id")+""+rs.getString("name"));
            }
            rs.close();
            st.close();
        } finally {
            if (con!=null) try {con.close();}catch (Exception ignore) {}
        }
    }


}
