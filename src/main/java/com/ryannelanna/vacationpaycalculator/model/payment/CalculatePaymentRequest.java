package com.ryannelanna.vacationpaycalculator.model.payment;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
public class CalculatePaymentRequest {

    @NotNull
    @Positive
    private Integer averageSalary;

    @NotNull
    private Period period;

}
