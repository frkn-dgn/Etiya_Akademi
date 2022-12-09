package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.user.AddUserRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.user.AddUserResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Address;
import com.etiya.ecommercedemopair2.entities.concretes.Users;

import java.util.List;

public interface UserService {
    List<Users> getAll();

    Users getById(int id);

    List<Users> getByEmail(String email);

    Users getByFirstname(String name);

    Users getByFirst_name(String name);

    AddUserResponse addUser(AddUserRequest addUserRequest);

}
