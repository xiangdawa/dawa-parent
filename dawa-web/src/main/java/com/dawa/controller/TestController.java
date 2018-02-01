package com.dawa.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiangzhenhua
 * @create 2018-01-30 11:49
 **/
@Api("/test")
@RestController("/test")
public class TestController {
    @GetMapping("/test")
    @ApiOperation("测试swagger")
    public String test(){
        return "Test";
    }
}
