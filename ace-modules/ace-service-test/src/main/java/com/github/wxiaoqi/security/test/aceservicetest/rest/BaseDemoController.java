package com.github.wxiaoqi.security.test.aceservicetest.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.github.wxiaoqi.security.test.aceservicetest.biz.BaseDemoBiz;
import com.github.wxiaoqi.security.test.aceservicetest.entity.BaseDemo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("baseDemo")
public class BaseDemoController extends BaseController<BaseDemoBiz,BaseDemo> {

}