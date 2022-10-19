package com.ryannelanna.vacationpaycalculator.service.payment.impl;


import com.ryannelanna.vacationpaycalculator.service.payment.PayCalculationService;
import org.springframework.stereotype.Service;

@Service
public class VacationPayCalculationService implements PayCalculationService {
    private final static double TAX = 0.13;

    public Integer calculate(int averageSalary, int vacationDays) {
        return (int) Math.round(averageSalary / 29.3 * vacationDays * (1 - TAX));
    }
}
