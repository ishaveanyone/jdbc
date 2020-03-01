/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-25 15:01
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtil {
    public static void main(String[] args) throws PropertyVetoException, SQLException {

        ComboPooledDataSource ds=new ComboPooledDataSource();
        ds.setDriverClass("org.postgresql.Driver");
        ds.setJdbcUrl("jdbc:postgresql://127.0.0.1:5432/xuppdb?currentSchema=public");
        ds.setUser("xupp");
        ds.setPassword("pass");
        ds.setMinPoolSize(10); // 连接池 的功能在这块
        Connection connection= ds.getConnection();

        System.out.println(connection.isClosed());


    }

}
