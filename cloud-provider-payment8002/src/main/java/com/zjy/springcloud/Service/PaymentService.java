package com.zjy.springcloud.Service;

import com.zjy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    public int creat(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
