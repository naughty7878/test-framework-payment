
package com.test.payment.api.service;

import com.test.common.entities.CommonResult;
import com.test.payment.api.bo.PaymentBo;
import com.test.payment.api.model.Payment;
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
    CommonResult<Integer> save (@RequestBody Payment payment);
    // 获取
    @RequestMapping(value = {"/payment/get"}, method = {RequestMethod.POST})
    CommonResult<Payment> get(@RequestBody PaymentBo paymentBo);
    // 查询
    @RequestMapping(value = {"/payment/list"}, method = {RequestMethod.POST})
    List<Payment> list(@RequestBody PaymentBo paymentBo);
}