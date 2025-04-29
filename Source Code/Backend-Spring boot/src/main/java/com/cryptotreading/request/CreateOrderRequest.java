package com.cryptotreading.request;

import com.cryptotreading.domain.OrderType;

import com.cryptotreading.model.Coin;
import lombok.Data;

import java.math.BigDecimal;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
