package com.ryannelanna.vacationpaycalculator.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.List;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "calendar")
public class CalendarConfiguration {

    private List<Calendar> holidays;
}
