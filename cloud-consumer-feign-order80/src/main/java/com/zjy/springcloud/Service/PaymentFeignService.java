package com.zjy.springcloud.Service;

import com.zjy.springcloud.entity.CommonResult;
import com.zjy.springcloud.entity.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
  * @program: com.zjy.springcloud
  * @description: Service
  * @Author: zjy 
  * @Date: 2020-06-28  
  */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

//    CommonResult<Payment> getPaymentById(@Param("id") Long id);

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout();

}
