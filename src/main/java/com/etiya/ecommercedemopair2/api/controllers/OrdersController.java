//package com.etiya.ecommercedemopair2.api.controllers;
//
//import com.etiya.ecommercedemopair2.business.abstracts.OrderService;
//import com.etiya.ecommercedemopair2.entities.concretes.Orders;
//import com.etiya.ecommercedemopair2.entities.concretes.Product;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Date;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/orders")
//public class OrdersController {
//
//    private OrderService orderService;
//
//    @Autowired
//    public OrdersController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//    @GetMapping("/getAll")
//    public List<Orders> getAll(@RequestParam("id") int id ){
//        return orderService.findAllOrdersOrderByOrder_date(id);
//    }
//    @GetMapping("/getById")
//    public List<Orders> findAllProductsUnitPriceBetween(@RequestParam("id") int id){
//        return orderService.findAllProductsUnitPriceBetween(id);
//    }
//}
