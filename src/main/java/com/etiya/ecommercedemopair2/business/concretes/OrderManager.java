//package com.etiya.ecommercedemopair2.business.concretes;
//
//import com.etiya.ecommercedemopair2.business.abstracts.OrderService;
//import com.etiya.ecommercedemopair2.entities.concretes.Orders;
//import com.etiya.ecommercedemopair2.repository.abstracts.OrderRepository;
//import lombok.AllArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//import java.util.List;
//@Service
//@AllArgsConstructor
//public class OrderManager implements OrderService {
//    private OrderRepository orderRepository;
//    @Override
//    public List<Orders> findAllOrdersOrderByOrder_date(int id) {
//        return orderRepository.getAllOrdersOrderById(id);
//        //return null;
//    }
//    public List<Orders> findAllProductsUnitPriceBetween(int id){
//        return orderRepository.findAllProductsUnitPriceBetween(id);
//    }
//}
