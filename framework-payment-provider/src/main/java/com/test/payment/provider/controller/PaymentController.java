package com.test.payment.provider.controller;

import com.test.common.entities.CommonResult;
import com.test.payment.api.bo.PaymentBo;
import com.test.payment.api.model.Payment;
import com.test.payment.api.service.PaymentRemoteService;
import com.test.payment.provider.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController implements PaymentRemoteService {

    @Autowired
    private PaymentService paymentService;

    @Override
    public CommonResult<Integer> save(@RequestBody Payment payment) {
        return null;
    }

    @Override
    public CommonResult<Payment> get(@RequestBody PaymentBo paymentBo) {
        Payment payment = paymentService.get(paymentBo.getId());
        return new CommonResult(0, null, payment);
    }

    @Override
    public List<Payment> list(@RequestBody PaymentBo paymentBo) {
        return null;
    }
}
