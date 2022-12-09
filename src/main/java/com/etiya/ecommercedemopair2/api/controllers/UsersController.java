package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.user.AddUserRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.user.AddUserResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.apiprefix+"users")
public class UsersController {
    private UserService userService;

    @Autowired
    UsersController(UserService userService) {

        this.userService = userService;
    }
//    @GetMapping("/getAll")
//    public List<Users> getAll() {
//        return userService.getAll();
//    }
//
//    @GetMapping("/findByEmail")
//    public List<Users> getByEmail(@RequestParam("email") String email) {
//        return userService.getByEmail(email);
//    }
//
//    @GetMapping("getByFirstName")
//    public Users getByFirstName(@RequestParam("name") String name) {
//        return userService.getByFirstname(name);
//
//    }

    @PostMapping("/add")
    public ResponseEntity<AddUserResponse> addUser(@RequestBody @Valid AddUserRequest addUserRequest) {
        return new ResponseEntity<AddUserResponse>(userService.addUser(addUserRequest), HttpStatus.CREATED);
    }

}
