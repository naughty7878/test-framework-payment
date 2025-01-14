package com.test.payment.provider.service.impl;

import com.test.payment.api.model.Payment;
import com.test.payment.provider.mapper.PaymentMapper;
import com.test.payment.provider.service.PaymentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int save(Payment payment) {
        return 0;
    }

    public Payment get(Long id) {
        com.test.payment.provider.entity.Payment payment = paymentMapper.get(id);
        Payment payment1 = new Payment();
        BeanUtils.copyProperties(payment, payment1);
        return payment1;
    }

    @Override
    public List<Payment> list(Long id) {
        return null;
    }
}
