package com.test.payment.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.test.payment.provider.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hd
 * @since 2025-01-15
 */
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
    public Payment get(@Param("id")Long id);
}
