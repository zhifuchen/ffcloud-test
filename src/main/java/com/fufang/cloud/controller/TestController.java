package com.fufang.cloud.controller;

import com.fufang.cloud.model.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chenzhifu on 2017/7/20.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public Object test() {
        return new TestModel();
    }

}
