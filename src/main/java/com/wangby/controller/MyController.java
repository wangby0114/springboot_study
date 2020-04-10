package com.wangby.controller;

import com.wangby.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {
    
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "hello, springboot");
        model.addAttribute("message", "hello, message");
        return "hello";
    }

    @RequestMapping("/thymeleaf")
    public String thymeleaf(ModelMap map) {
        map.put("thText", "th:text设置文本内容 <b> 加粗 </b>");
        map.put("thUText", "th:utext设置文本内容 <b> 加粗 </b>");
        map.put("thValue", "th:thValue设置当前元素的value值");
        map.put("thEach", "Arrays.asList(\"th:each\", \"遍历列表\")");
        map.put("thIf", "msg is not null");
        map.put("thObject",  new Person("wangby", 12, "男"));

        return "thymeleaf";
    }

    @RequestMapping("standardExpression")
    public String standardExpression(ModelMap map){
        map.put("Str", "Blog");
        map.put("Bool", true);
        map.put("Array", new Integer[]{1,2,3,4});
        map.put("List", Arrays.asList(1,3,2,4,0));
        Map hashMap = new HashMap();
        hashMap.put("thName", "${#...}");
        hashMap.put("desc", "变量表达式内置方法");
        map.put("Map", hashMap);
        map.put("Date", new Date());
        map.put("Num", 888.888D);
        return "standardExpression";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
}
