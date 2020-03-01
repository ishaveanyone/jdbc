/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-02-26 17:12
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package org.example;

import org.postgresql.xa.PGXADataSource;

import javax.sql.XADataSource;
import java.sql.SQLException;

public class XADataSourceTest {

    public static void main(String[] args) throws SQLException {
        XADataSource xaDataSource=new PGXADataSource();
        xaDataSource.getXAConnection();

    }
}
