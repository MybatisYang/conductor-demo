package com.example.demo.work;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 采集
 * @Author: yjs
 * @createTime: 2022年04月25日 14:16:07
 * @version: 1.0
 */
@RestController
public class Collect {
    @GetMapping("/collect/{json}")
    public CommonResult collect(@PathVariable("json") String json){
        System.out.println("采集服务收到的json数据为: " + json);
        return CommonResult.ok("数据采集成功");
    }

    @GetMapping("/collect1")
    public CommonResult collect1(String json){
        System.out.println("采集服务1收到的json数据为: " + json);
        return CommonResult.ok("数据采集成功");
    }
}
