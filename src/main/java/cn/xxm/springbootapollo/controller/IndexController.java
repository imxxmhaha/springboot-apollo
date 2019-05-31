package cn.xxm.springbootapollo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxm
 * @create 2019-05-31 6:40
 */
@RestController
public class IndexController {

    @Value("${testparam:test}")
    private String testParam;

    @GetMapping("/test")
    public String getTestParam(){
        return testParam;
    }
}
