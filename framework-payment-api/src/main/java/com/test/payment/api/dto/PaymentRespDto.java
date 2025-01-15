package com.test.payment.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付model
 * 与数据库一一对应
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRespDto {
    private Long id;
    private String serial;
}
