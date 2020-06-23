package com.zjy.springcloud.Mapper;

import com.zjy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    public int creat(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
