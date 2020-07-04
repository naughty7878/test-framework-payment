package com.test.payment.provider.service.impl;

import com.test.payment.api.model.Payment;
import com.test.payment.provider.mapper.PaymentMapper;
import com.test.payment.provider.service.PaymentService;
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
        return paymentMapper.get(id);
    }

    @Override
    public List<Payment> list(Long id) {
        return null;
    }
}
