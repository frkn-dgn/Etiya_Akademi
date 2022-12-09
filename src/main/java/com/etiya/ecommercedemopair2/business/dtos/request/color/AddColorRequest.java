package com.etiya.ecommercedemopair2.business.dtos.request.color;

import com.etiya.ecommercedemopair2.business.constants.Messages;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@NotNull(message = Messages.Name.NameFieldCantBeEmpty)
@NotBlank(message = Messages.Name.NameFieldCantBeEmpty)
public class AddColorRequest {
    private String name;
}
