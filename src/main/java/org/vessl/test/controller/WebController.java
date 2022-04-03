package org.vessl.test.controller;

import org.vessl.core.bean.Inject;
import org.vessl.test.bean.TestBean;
import org.vessl.test.service.TestServer;
import org.vessl.web.annotation.Get;
import org.vessl.web.annotation.Web;

import java.util.List;

@Web("vessl")
public class WebController {

    @Inject
    TestServer testServer;
    @Get(value = "getName")
    public List<TestBean> getName(){
       return testServer.getName();
    }
}
