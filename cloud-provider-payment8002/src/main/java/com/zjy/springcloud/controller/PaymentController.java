package com.zjy.springcloud.controller;

import com.zjy.springcloud.Service.PaymentService;
import com.zjy.springcloud.entity.CommonResult;
import com.zjy.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.transform.Result;

/**
 * @program: com.zjy.springcloud
 * @description: Controller
 * @author: Zjy
 * @create: 2020-06-15 17:54
 **/
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment){
        int creat = paymentService.creat(payment);
        if (creat>0){
            return new CommonResult(200,"插入成功"+serverPort,creat);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id, Payment payment){
        Payment paymentById = paymentService.getPaymentById(id);
        if (paymentById!=null){
            return new CommonResult(200,"查询成功"+serverPort,paymentById);
        }else {
            return new CommonResult(444,"查询失败",null);
        }
    }

}
