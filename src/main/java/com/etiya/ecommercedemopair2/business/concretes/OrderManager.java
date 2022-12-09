package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.CustomerService;
import com.etiya.ecommercedemopair2.business.abstracts.OrderService;
import com.etiya.ecommercedemopair2.business.abstracts.PaymentMethodService;
import com.etiya.ecommercedemopair2.business.abstracts.ShipperService;
import com.etiya.ecommercedemopair2.business.dtos.request.order.AddOrderRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderResponse;
import com.etiya.ecommercedemopair2.core.util.mapping.ModelMapperService;
import com.etiya.ecommercedemopair2.entities.concretes.Customer;
import com.etiya.ecommercedemopair2.entities.concretes.Orders;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import com.etiya.ecommercedemopair2.entities.concretes.Shipper;
import com.etiya.ecommercedemopair2.repository.abstracts.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class OrderManager implements OrderService {
    private OrderRepository orderRepositoy;
    private ShipperService shipperService;
    private PaymentMethodService paymentMethodService;
    private CustomerService customerService;
    private ModelMapperService modelMapperService;
//    @Override
//    public List<Orders> findAllOrdersOrderByOrder_date(int id) {
//        return orderRepositoy.getAllOrdersOrderById(id);
        //return null;
//    }

    @Override
    public Orders getById(int order_id) {
        return null;
    }

    @Override
    public AddOrderResponse addOrder(AddOrderRequest addOrderRequest) {
        Orders order=modelMapperService.getMapper().map(addOrderRequest,Orders.class);

        Orders savedOrder = orderRepositoy.save(order);

        AddOrderResponse response =
                modelMapperService.getMapper().map(savedOrder,AddOrderResponse.class);
        return response;
    }
//    public List<Order> findAllProductsUnitPriceBetween(int id){
//        return orderRepositoy.findAllProductsUnitPriceBetween(id);
//    }
}