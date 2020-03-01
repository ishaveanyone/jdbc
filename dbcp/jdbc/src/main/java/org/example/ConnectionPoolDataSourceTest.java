/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-26 17:07
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example;

import org.postgresql.ds.PGConnectionPoolDataSource;
import org.postgresql.jdbc2.optional.ConnectionPool;

import javax.sql.ConnectionPoolDataSource;
import java.sql.CallableStatement;
import java.sql.DriverManager;

public class ConnectionPoolDataSourceTest
{

    public static void main(String[] args) {

        ConnectionPoolDataSource connectionPoolDataSource=new PGConnectionPoolDataSource();
//        CallableStatement
//        connectionPoolDataSource.getPooledConnection("xupp","pass");
    }
}
