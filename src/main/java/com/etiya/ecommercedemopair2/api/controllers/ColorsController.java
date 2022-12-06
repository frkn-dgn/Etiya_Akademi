package com.etiya.ecommercedemopair2.api.controllers;

import com.etiya.ecommercedemopair2.business.abstracts.ColorService;
import com.etiya.ecommercedemopair2.business.dtos.request.color.AddColorRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.color.AddColorResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/color")
public class ColorsController {

    private ColorService colorService;

    @GetMapping("")
    public List<Color> getAll(){
        return colorService.getAll();
    }

    @Autowired
    ColorsController(ColorService colorService){

        this.colorService=colorService;
    }
    @PostMapping("/add")
    public ResponseEntity<AddColorResponse> addColor(@RequestBody AddColorRequest addColorRequest){
        return new ResponseEntity<AddColorResponse>(colorService.addColor(addColorRequest), HttpStatus.CREATED);
    }
}
