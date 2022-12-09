package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.OrderService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.order.AddOrderRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.order.AddOrderResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Orders;
import com.etiya.ecommercedemopair2.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(Paths.apiprefix+"orders")
public class OrdersController {

    private OrderService orderService;

    @Autowired
    public OrdersController(OrderService orderService) {
        this.orderService = orderService;
    }

//    @GetMapping("/getAll")
//    public List<Orders> getAll(@RequestParam("id") int id ){
//        return orderService.findAllOrdersOrderByOrder_date(id);
//    }
//    @GetMapping("/getById")
//    public List<Order> findAllProductsUnitPriceBetween(@RequestParam("id") int id){
//        return orderService.findAllProductsUnitPriceBetween(id);
//    }

    @PostMapping("/add")
    public ResponseEntity<AddOrderResponse> addOrder(@RequestBody @Valid AddOrderRequest addOrderRequest){
        return new ResponseEntity<>(orderService.addOrder(addOrderRequest), HttpStatus.CREATED);
    }
}
