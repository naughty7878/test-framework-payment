package com.test.payment.provider.mapper;

import com.test.payment.api.model.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {

    public Payment get(@Param("id")Long id);
}
