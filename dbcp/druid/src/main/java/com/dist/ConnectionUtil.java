/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-28 14:56
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package com.dist;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static void main(String[] args) throws SQLException {
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://127.0.0.1:5432/xuppdb?currentSchema=public");
        ds.setUsername("xupp");
        ds.setPassword("pass");
        ds.setMinIdle(10);
        Connection connection= ds.getConnection();
        System.out.println(connection.isValid(100));
    }
}
