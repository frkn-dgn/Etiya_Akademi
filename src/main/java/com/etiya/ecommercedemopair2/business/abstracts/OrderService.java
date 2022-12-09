package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.order.AddOrderRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Orders;

import java.util.Date;
import java.util.List;

public interface OrderService {
//    List<Orders> findAllOrdersOrderByOrder_date(int id);

    Orders getById(int order_id);

    AddOrderResponse addOrder(AddOrderRequest addOrderRequest);

    //List<Order> findAllProductsUnitPriceBetween(int id);
}