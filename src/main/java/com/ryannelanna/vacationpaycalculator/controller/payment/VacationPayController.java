package com.ryannelanna.vacationpaycalculator.controller.payment;


import com.ryannelanna.vacationpaycalculator.model.payment.CalculatePaymentRequest;
import com.ryannelanna.vacationpaycalculator.service.payment.PayService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@AllArgsConstructor
public class VacationPayController {

    private PayService payService;

    @GetMapping("calculate")
    public Integer getVacationPay(@RequestBody @Valid CalculatePaymentRequest request) {
        return payService.getPayment(request);
    }
}
