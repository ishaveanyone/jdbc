/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-25 15:17
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example;

import org.postgresql.Driver;
import org.postgresql.ds.PGConnectionPoolDataSource;
import org.postgresql.ds.PGPooledConnection;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import java.sql.*;

public class ConnectionUtil {
    private static Connection conn = null;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        DriverManager.registerDriver(new Driver());
        String dbUrl = "jdbc:postgresql://127.0.0.1:5432/xuppdb?currentSchema=public";
        conn = DriverManager.getConnection(dbUrl, "xupp", "pass");
        DatabaseMetaData databaseMetaData= conn.getMetaData();
        System.out.println(databaseMetaData.getMaxRowSize());
        System.out.println(databaseMetaData.getMaxConnections()); // 最多只支持 8192 个 连接
        System.out.println(databaseMetaData.getDefaultTransactionIsolation());
        System.out.println(databaseMetaData.supportsRefCursors());
        ConnectionPoolDataSource connectionPoolDataSource=new PGConnectionPoolDataSource();
//        connectionPoolDataSource
//        PGPooledConnection pgPooledConnection=new PGPooledConnection(conn,false);
        conn.setAutoCommit(false);//设置自动提交为false
        PreparedStatement preparedStatement= conn.prepareStatement("insert into test values('8','333')");
        Savepoint savepoint1= conn.setSavepoint("point1");
        preparedStatement.execute();
        conn.rollback(savepoint1);
        conn.rollback();

        conn.commit();

        PreparedStatement preparedStatement2= conn.prepareStatement("select * from test");

        ResultSet rs2=preparedStatement2.executeQuery();
        while (rs2.next()){
            System.out.println(rs2.getInt("id")+rs2.getString("name"));
        }

        rs2.close();
        preparedStatement.close();
        conn.close();

    }
}
