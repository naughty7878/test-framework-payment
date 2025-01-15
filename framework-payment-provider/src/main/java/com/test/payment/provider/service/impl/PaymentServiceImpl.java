package com.test.payment.provider.service.impl;

import com.test.payment.api.dto.PaymentRespDto;
import com.test.payment.provider.entity.Payment;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.payment.provider.mapper.PaymentMapper;
import com.test.payment.provider.service.IPaymentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hd
 * @since 2025-01-15
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int save(PaymentRespDto paymentRespDto) {
        return 0;
    }

    public PaymentRespDto get(Long id) {
        Payment payment = paymentMapper.get(id);
        PaymentRespDto paymentRespDto1 = new PaymentRespDto();
        BeanUtils.copyProperties(payment, paymentRespDto1);
        return paymentRespDto1;
    }

    @Override
    public List<PaymentRespDto> list(Long id) {
        return null;
    }

}
