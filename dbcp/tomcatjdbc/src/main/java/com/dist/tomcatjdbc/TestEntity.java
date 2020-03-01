/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-01-07 16:11
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package com.dist.tomcatjdbc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "test")
public class TestEntity {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
