
package com.test.payment.api.service;

import com.test.common.entities.CommonResult;
import com.test.payment.api.dto.PaymentReqDto;
import com.test.payment.api.dto.PaymentRespDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * 远程调用接口
 */
public interface PaymentRemoteService {
    // 保存
    @RequestMapping(value = {"/payment/save"}, method = {RequestMethod.POST})
    CommonResult<Integer> save (@RequestBody PaymentRespDto paymentRespDto);
    // 获取
    @RequestMapping(value = {"/payment/get"}, method = {RequestMethod.POST})
    CommonResult<PaymentRespDto> get(@RequestBody PaymentReqDto paymentReqDto);
    // 查询
    @RequestMapping(value = {"/payment/list"}, method = {RequestMethod.POST})
    List<PaymentRespDto> list(@RequestBody PaymentReqDto paymentReqDto);
}