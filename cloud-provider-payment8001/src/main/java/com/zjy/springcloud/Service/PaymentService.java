package com.zjy.springcloud.Service;

import com.zjy.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    /**
     * @param payment
     * @return
     */
    public int creat(Payment payment);

    /**
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
