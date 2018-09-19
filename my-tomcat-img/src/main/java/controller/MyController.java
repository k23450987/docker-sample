package controller;

import mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    private MyMapper myMapper;

    @GetMapping("/")
    @ResponseBody
    public String test() {
        return "hello world";
    }

    @GetMapping("/test1")
    @ResponseBody
    public String test1() {
        myMapper.insertTest();
        return "1";
    }
}
