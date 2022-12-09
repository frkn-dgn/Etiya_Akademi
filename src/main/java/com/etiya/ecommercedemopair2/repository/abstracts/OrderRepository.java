package com.etiya.ecommercedemopair2.repository.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> {

//    @Query("SELECT o FROM Order o WHERE o.payment_id = :id")
//    List<Order> findAllProductsUnitPriceBetween(int id);

//    List<Orders> getAllOrdersOrderById(int id);
}