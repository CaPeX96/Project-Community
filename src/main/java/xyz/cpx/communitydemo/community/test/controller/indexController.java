package xyz.cpx.communitydemo.community.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {
    @RequestMapping(value = "/")
    public String index(@RequestParam(name = "name",required = false, defaultValue = "world")String name , Model model){
        model.addAttribute("name",name);
        return "index";
    }
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
}
