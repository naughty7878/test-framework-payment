package com.test.payment.provider.service;


import com.test.payment.api.model.Payment;

import java.util.List;

public interface PaymentService {
    // 保存
    public int save(Payment payment);
    // 获取
    public Payment get(Long id);
    // 查询
    public List<Payment> list(Long id);
}
