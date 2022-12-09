package com.etiya.ecommercedemopair2.repository.abstracts;

import com.etiya.ecommercedemopair2.entities.concretes.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Integer> {


    @Query("Select u from Users u WHERE first_name=:name")
    Users findByUserName(String name);


    List<Users> findByEmail(String email);

//    @Query("Select u from User as u WHERE first_name=:name")
//    Users findByFirst_name(String name);
}

