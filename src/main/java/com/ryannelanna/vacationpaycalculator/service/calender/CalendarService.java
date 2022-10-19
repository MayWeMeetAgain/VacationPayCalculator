package com.ryannelanna.vacationpaycalculator.service.calender;

import java.util.Calendar;

public interface CalendarService {

    boolean isHoliday(Calendar date);

    int calculateRegularDays(Calendar start, Integer duration);
}
