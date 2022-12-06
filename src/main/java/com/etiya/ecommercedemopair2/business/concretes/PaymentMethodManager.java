package com.etiya.ecommercedemopair2.business.concretes;

import com.etiya.ecommercedemopair2.business.abstracts.PaymentMethodService;
import com.etiya.ecommercedemopair2.business.dtos.request.paymentmethod.AddPaymentMethodRequest;
import com.etiya.ecommercedemopair2.business.dtos.response.paymentmethod.AddPaymentMethodResponse;
import com.etiya.ecommercedemopair2.entities.concretes.PaymentMethod;
import com.etiya.ecommercedemopair2.repository.abstracts.PaymentMethodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaymentMethodManager implements PaymentMethodService{

    private PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethod> getAll(){
        return paymentMethodRepository.findAll();
    }

    @Override
    public PaymentMethod getById(int id) {
        return paymentMethodRepository.findById(id).orElseThrow();
    }

    @Override
    public AddPaymentMethodResponse addPaymentMethod(AddPaymentMethodRequest addPaymentMethodRequest) {
        PaymentMethod paymentMethod = new PaymentMethod();
        paymentMethod.setName(addPaymentMethodRequest.getName());

        PaymentMethod savedPaymentMethod=paymentMethodRepository.save(paymentMethod);

        AddPaymentMethodResponse response =
                new AddPaymentMethodResponse(savedPaymentMethod.getId(),savedPaymentMethod.getName());
        return response;
    }

}
