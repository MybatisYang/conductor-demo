package com.example.demo.work;

import org.springframework.web.bind.annotation.*;

/**
 * @Description: 审核
 * @Author: yjs
 * @createTime: 2022年04月25日 14:18:09
 * @version: 1.0
 */
@RestController
public class Examine {
    @PostMapping("/examine")
    public CommonResult examine(@RequestBody CommonResult commonResult){
        System.out.println("*****************************");
        System.out.println("审核服务收到的是: " + commonResult.toString());
        if (commonResult.getCode() == 200){
            return CommonResult.ok("数据审核成功", commonResult.getData());
        }else {
            return CommonResult.error(ErrorEnum.VALID_EXCEPTION);
        }
    }

    @RequestMapping("/examine1")
    public CommonResult examine1(String code, String message, String data){
        System.out.println("*****************************");
        System.out.println("审核服务1收到的code是: " +code);
        if (code == "200"){
            return CommonResult.ok("数据审核1成功", data);
        }else {
            return CommonResult.error(ErrorEnum.VALID_EXCEPTION);
        }
    }

    @RequestMapping("/encode_task")
    public CommonResult encode_task(@RequestParam("sourceRequestId")Integer sourceRequestId,@RequestParam("qcElementType")String qcElementType){
        System.out.println("*****************************");
        System.out.println("sourceRequestId: " +sourceRequestId);
        if (sourceRequestId == 200){
            return CommonResult.ok("数据审核1成功", sourceRequestId);
        }else {
            return CommonResult.error(ErrorEnum.VALID_EXCEPTION);
        }
    }
}
