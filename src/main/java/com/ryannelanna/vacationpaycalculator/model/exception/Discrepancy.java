package com.ryannelanna.vacationpaycalculator.model.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Discrepancy {

    private String field;

    private String cause;
}
