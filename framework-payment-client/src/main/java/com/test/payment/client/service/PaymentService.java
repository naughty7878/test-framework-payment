package com.test.payment.client.service;

import com.test.common.entities.CommonResult;
import com.test.payment.api.PaymentInterface;
import com.test.payment.api.bo.PaymentBo;
import com.test.payment.api.model.Payment;
import com.test.payment.api.service.PaymentRemoteService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

import java.util.List;

@FeignClient(name = PaymentInterface.SERVICE_NAME, fallback = PaymentService.HystrixClientFallback.class)
public interface PaymentService extends PaymentRemoteService {

    @Component
    public static class HystrixClientFallback implements PaymentService {

        @Override
        public CommonResult<Integer> save(Payment payment) {
            return null;
        }

        @Override
        public CommonResult<Payment> get(PaymentBo paymentBo) {
            return new CommonResult(500, "服务异常");
        }

        @Override
        public List<Payment> list(PaymentBo paymentBo) {
            return null;
        }
    }
}
