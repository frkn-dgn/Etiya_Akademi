package com.etiya.ecommercedemopair2.business.dtos.response.category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class AddCategoryResponse {
    private int id;
    private String name;
}
