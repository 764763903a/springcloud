package com.zjy.springcloud.Service.impl;

import com.zjy.springcloud.Mapper.PaymentMapper;
import com.zjy.springcloud.Service.PaymentService;
import com.zjy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: com.zjy.springcloud
 * @description: Impl
 * @author: Zjy
 * @create: 2020-06-15 17:18
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int creat(Payment payment) {
        return paymentMapper.creat(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentMapper.getPaymentById(id);
    }

}
