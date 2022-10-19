package com.ryannelanna.vacationpaycalculator.config;

import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

@Component
@ConfigurationPropertiesBinding
public class CalendarConverter implements Converter<String, Calendar> {

    @Override
    public Calendar convert(String timestamp) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("MMM dd", Locale.ENGLISH);
        try {
            calendar.setTime(format.parse(timestamp));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return calendar;
    }
}
