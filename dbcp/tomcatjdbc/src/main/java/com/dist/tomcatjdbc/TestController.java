/**
 * Company: 上海数慧系统技术有限公司
 * Department: 数据中心
 * Date: 2020-01-07 16:15
 * Author: xupp
 * Email: xupp@dist.com.cn
 * Desc：
 */

package com.dist.tomcatjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestDAO testDAO;
    @RequestMapping("/findmessage")
    public Object getmessage(){
        return testDAO.findAll();
    }

}
