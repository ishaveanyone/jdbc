/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2019-12-19 11:25
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */
package com.dist.tomcatjdbc;

import org.springframework.data.repository.CrudRepository;

public interface TestDAO extends CrudRepository<TestEntity,Long> {
}
