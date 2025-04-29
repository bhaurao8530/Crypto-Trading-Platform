package com.cryptotreading.service;

import com.cryptotreading.domain.OrderType;
import com.cryptotreading.model.Coin;
import com.cryptotreading.model.Order;
import com.cryptotreading.model.OrderItem;
import com.cryptotreading.model.User;
import com.cryptotreading.request.CreateOrderRequest;


import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
