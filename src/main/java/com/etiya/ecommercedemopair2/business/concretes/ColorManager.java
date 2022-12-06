package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.ColorService;
import com.etiya.ecommercedemopair2.business.dtos.request.color.AddColorRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.color.AddColorResponse;
import com.etiya.ecommercedemopair2.entities.concretes.Color;
import com.etiya.ecommercedemopair2.repository.abstracts.ColorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ColorManager implements ColorService {

    private ColorRepository colorRepository;

    public List<Color> getAll(){

        return colorRepository.findAll();
    }

    @Override
    public Color getById(int id) {
        return colorRepository.findById(id).orElseThrow();
    }

    @Override
    public AddColorResponse addColor(AddColorRequest addColorRequest) {
        Color color = new Color();
        color.setName(addColorRequest.getName());

        Color savedColor =colorRepository.save(color);

        AddColorResponse response =
                new AddColorResponse(savedColor.getId(),savedColor.getName());
        return response;
    }

}
