package com.ryannelanna.vacationpaycalculator.service.calender.impl;

import com.ryannelanna.vacationpaycalculator.config.CalendarConfiguration;
import com.ryannelanna.vacationpaycalculator.service.calender.CalendarService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Getter
@Setter
@AllArgsConstructor
public class CalendarServiceImpl implements CalendarService {

    CalendarConfiguration vacationConfiguration;

    public boolean isHoliday(Calendar date) {
        return vacationConfiguration.getHolidays().contains(new GregorianCalendar(1970, date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH)));
    }

    public int calculateRegularDays(Calendar start, Integer duration) {
        int days = 0;
        for (int i = 0; i < duration; i++) {
            days += isHoliday(start) ? 0 : 1;
            start.add(Calendar.DAY_OF_MONTH, 1);
        }
        return days;
    }
}
