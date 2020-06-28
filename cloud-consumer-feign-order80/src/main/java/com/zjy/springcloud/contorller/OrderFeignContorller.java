package com.zjy.springcloud.contorller;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.zjy.springcloud.Service.PaymentFeignService;
import com.zjy.springcloud.entity.CommonResult;
import com.zjy.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @program: com.zjy.springcloud
 * @description: OrderFeign
 * @author: Zjy
 * @create: 2020-06-28 09:14
 **/
@RestController
@Slf4j
public class OrderFeignContorller {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/conpayment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/conpayment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }

}
