package com.ryannelanna.vacationpaycalculator.model.exception;

import com.ryannelanna.vacationpaycalculator.model.exception.Discrepancy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ValidationExceptionResponse {

    private String message;

    private List<Discrepancy> details;
}
