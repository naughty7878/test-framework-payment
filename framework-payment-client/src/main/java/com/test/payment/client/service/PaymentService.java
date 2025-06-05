package com.test.payment.client.service;

import com.test.common.entity.CommonResult;
import com.test.payment.api.PaymentInterface;
import com.test.payment.api.dto.PaymentReqDto;
import com.test.payment.api.dto.PaymentRespDto;
import com.test.payment.api.service.PaymentRemoteService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;

import java.util.List;

@FeignClient(name = PaymentInterface.SERVICE_NAME, fallback = PaymentService.HystrixClientFallback.class)
public interface PaymentService extends PaymentRemoteService {

    @Component
    public static class HystrixClientFallback implements PaymentService {

        @Override
        public CommonResult<Integer> save(PaymentRespDto paymentRespDto) {
            return null;
        }

        @Override
        public CommonResult<PaymentRespDto> get(PaymentReqDto paymentReqDto, MultiValueMap<String, String> headers) {
            return new CommonResult(500, "服务异常", null);
        }

        @Override
        public List<PaymentRespDto> list(PaymentReqDto paymentReqDto) {
            return null;
        }
    }
}
