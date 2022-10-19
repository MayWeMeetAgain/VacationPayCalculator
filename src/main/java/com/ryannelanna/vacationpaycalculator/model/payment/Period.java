package com.ryannelanna.vacationpaycalculator.model.payment;

import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Calendar;

@Getter
public class Period {

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Calendar start;

    @NotNull
    @Positive
    private Integer duration;
}
