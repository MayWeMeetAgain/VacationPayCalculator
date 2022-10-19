package com.ryannelanna.vacationpaycalculator.controller.exception;

import com.ryannelanna.vacationpaycalculator.model.exception.Discrepancy;
import com.ryannelanna.vacationpaycalculator.model.exception.ValidationExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionController {
    private static final String REQUEST_ERROR = "Request Validation Failed";

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ValidationExceptionResponse handleValidationException(MethodArgumentNotValidException exc) {
        List<Discrepancy> details = exc.getBindingResult().getFieldErrors().stream()
                .map(source -> new Discrepancy(source.getField(), source.getDefaultMessage())).collect(Collectors.toList());
        return new ValidationExceptionResponse(REQUEST_ERROR, details);
    }
}
