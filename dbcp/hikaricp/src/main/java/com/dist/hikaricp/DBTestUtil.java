/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-01-07 17:32
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package com.dist.hikaricp;

import com.sun.jndi.ldap.pool.PooledConnectionFactory;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;

//测试下这个好像自己吹的很牛逼的开源软件
public class DBTestUtil {

    public static void main(String[] args) throws SQLException {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/xuppdb?currentSchema=public");
        config.setUsername("xupp");
        config.setPassword("pass");
        config.addDataSourceProperty("dataSourceClassName", "org.postgresql.ds.PGSimpleDataSource");
        config.addDataSourceProperty("cachePrepStmts", "true");
        config.addDataSourceProperty("prepStmtCacheSize", "250");
        config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

//        config.setSchema("public");
        HikariDataSource ds = new HikariDataSource(config);


        Connection connection =ds.getConnection();

        Statement statement= connection.createStatement();
        ResultSet resultSet= statement.executeQuery("select * from public.test");
//        System.out.println(resultSet.get());
        while (resultSet.next()){
            System.out.println(resultSet.getInt("id")+resultSet.getString("name"));
        }
        statement.closeOnCompletion();
    }
}
