package com.ryannelanna.vacationpaycalculator;

import com.ryannelanna.vacationpaycalculator.config.CalendarConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
public class VacationPayCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VacationPayCalculatorApplication.class, args);
    }

}
