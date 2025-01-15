package com.test.payment.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.payment.api.dto.PaymentRespDto;
import com.test.payment.provider.entity.Payment;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author hd
 * @since 2025-01-15
 */
public interface IPaymentService extends IService<Payment> {

    // 保存
    public int save(PaymentRespDto paymentRespDto);
    // 获取
    public PaymentRespDto get(Long id);
    // 查询
    public List<PaymentRespDto> list(Long id);

}
