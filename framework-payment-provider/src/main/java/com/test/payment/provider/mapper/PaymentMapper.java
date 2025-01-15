package com.test.payment.provider.mapper;

import com.test.payment.provider.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
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

    Payment get(@Param("id") Long id);

}
