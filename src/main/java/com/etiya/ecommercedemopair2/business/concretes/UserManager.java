package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.UserService;
import com.etiya.ecommercedemopair2.business.dtos.request.user.AddUserRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.user.AddUserResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Users;
import com.etiya.ecommercedemopair2.repository.abstracts.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserManager implements UserService {
    private UserRepository userRepository;
    @Override
    public List<Users> getAll() {
        return userRepository.findAll();
    }

    @Override
    public Users getById(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Users> getByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public Users getByFirstname(String name) {
        return userRepository.findByFirstName(name);
    }

    @Override
    public AddUserResponse addUser(AddUserRequest addUserRequest) {
        Users users = new Users();

        users.setFirst_name(addUserRequest.getFirst_name());


        Users savedUser = userRepository.save(users);

        AddUserResponse response =
                new AddUserResponse(savedUser.getId(),savedUser.getFirst_name(),savedUser.getLast_name(),
                        savedUser.getPhone_number(), savedUser.getEmail(),savedUser.getPassword(),savedUser.getBirth_date());
        return response;
    }
}
