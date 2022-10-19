package com.ryannelanna.vacationpaycalculator.service.payment.impl;

import com.ryannelanna.vacationpaycalculator.model.payment.CalculatePaymentRequest;
import com.ryannelanna.vacationpaycalculator.model.payment.Period;
import com.ryannelanna.vacationpaycalculator.service.calender.CalendarService;
import com.ryannelanna.vacationpaycalculator.service.payment.PayCalculationService;
import com.ryannelanna.vacationpaycalculator.service.payment.PayService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class VacationPayService implements PayService {

    private PayCalculationService payCalculationService;
    private CalendarService calenderService;

    public Integer getPayment(CalculatePaymentRequest request) {
        int days = calculatePayableDays(request.getPeriod());
        return payCalculationService.calculate(request.getAverageSalary(), days);
    }

    public Integer calculatePayableDays(Period period) {
        if (period.getStart() == null)
            return period.getDuration();
        return calenderService.calculateRegularDays(period.getStart(), period.getDuration());
    }
}
