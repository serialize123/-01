package com.taotao.manager.web.test;



import com.taotao.manager.mapper.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 胡家宇
 * @version 2.3
 * @description com.taotao.manager.web.test
 * @date 2018/2/6
 */
@Controller
@RequestMapping("/test")
public class TestController {
@Autowired
    private TestService testService;

@ResponseBody
@RequestMapping("/query")
    public String queryDate(){
    return this.testService.queryDate();
}
}
