package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.ColorService;
import com.etiya.ecommercedemopair2.business.constants.Paths;
import com.etiya.ecommercedemopair2.business.dtos.request.color.AddColorRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.color.AddColorResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(Paths.apiprefix+"colors")
public class ColorsController {
    private ColorService colorService;

    @Autowired
    ColorsController(ColorService colorService){

        this.colorService=colorService;
    }

    @PostMapping("/add")
    public ResponseEntity<AddColorResponse> addColor(@RequestBody @Valid AddColorRequest addColorRequest){
        return new ResponseEntity<AddColorResponse>(colorService.addColor(addColorRequest), HttpStatus.CREATED);
    }
}