package com.ryannelanna.vacationpaycalculator.service.payment;

import com.ryannelanna.vacationpaycalculator.model.payment.CalculatePaymentRequest;
import com.ryannelanna.vacationpaycalculator.model.payment.Period;

public interface PayService {

    Integer getPayment(CalculatePaymentRequest vacationInfo);

    Integer calculatePayableDays(Period interval);
}
