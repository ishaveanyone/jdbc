/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-25 10:56
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.postgresql.Driver;

import javax.sql.DataSource;
import java.sql.*;

public class ConnectionUtil {
    private static Connection conn = null;

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = setupDataSource();
        Connection connection=dataSource.getConnection();
    }

    public static DataSource setupDataSource() {
         BasicDataSource ds = new BasicDataSource();
         ds.setDriverClassName("org.postgresql.Driver");
         ds.setUrl("jdbc:postgresql://127.0.0.1:5432/xuppdb?currentSchema=public");
         ds.setUsername("xupp");
         ds.setPassword("pass");
         return ds;
    }

}
