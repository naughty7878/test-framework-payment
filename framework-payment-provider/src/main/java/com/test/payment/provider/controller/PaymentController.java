package com.test.payment.provider.controller;

import com.test.common.entity.CommonResult;
import com.test.payment.api.dto.PaymentReqDto;
import com.test.payment.api.dto.PaymentRespDto;
import com.test.payment.api.service.PaymentRemoteService;
import com.test.payment.provider.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController implements PaymentRemoteService {

    @Autowired
    private IPaymentService paymentService;

    @Override
    public CommonResult<Integer> save(@RequestBody PaymentRespDto paymentRespDto) {
        return null;
    }

    @Override
    public CommonResult<PaymentRespDto> get(@RequestBody PaymentReqDto paymentReqDto) {
        PaymentRespDto paymentRespDto = paymentService.get(paymentReqDto.getId());
        return new CommonResult(0, null, paymentRespDto);
    }

    @Override
    public List<PaymentRespDto> list(@RequestBody PaymentReqDto paymentReqDto) {
        return null;
    }
}
