package com.test.payment.client;

import com.test.common.entity.CommonResult;
import com.test.payment.api.dto.PaymentReqDto;
import com.test.payment.api.dto.PaymentRespDto;
import com.test.payment.client.factories.ServiceFactory;
import com.test.payment.client.service.PaymentService;

/**
 * 提供一个clien类来，提供微服务
 *
 * 流程：
 *  从Spring容器中，获取的自动注入的FeignClient
 *  通过BeatFactory类，获取
 *  然后得到服务类，调用其中方法
 *
 */
public class PaymentClient {

    private static final ServiceFactory<PaymentService> serviceFactory = new ServiceFactory<>(PaymentService.class);

    public static CommonResult<PaymentRespDto> get(PaymentReqDto paymentReqDto)  {
        PaymentService paymentService = serviceFactory.getObject();
        return paymentService.get(paymentReqDto, null);
    }

}
