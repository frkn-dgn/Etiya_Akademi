package com.etiya.ecommercedemopair2.business.abstracts;

import com.etiya.ecommercedemopair2.business.dtos.request.color.AddColorRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.color.AddColorResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Color;

import java.util.List;

public interface ColorService {
    List<Color> getAll();

    Color getById(int id);
    AddColorResponse addColor(AddColorRequest addColorRequest);
}
