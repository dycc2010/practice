package org.zz.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.zz.enums.TestEnum;
import org.zz.service.TestService;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

/**
 * Created by zz on 2016/11/12.
 */

@Controller
public class HelloController {

    @Autowired
    private TestService testService;

    @RequestMapping("ABC")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "我的第一个SpringMVC应用");
        mv.setViewName("hello");
        System.out.println(TestEnum.fail.getMsg());
        //TestService testService=new TestService();
        testService.testUpdate(1,new BigDecimal(100.32));
        return mv;
    }
}
