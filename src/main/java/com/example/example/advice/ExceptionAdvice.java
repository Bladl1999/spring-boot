package com.example.example.advice;

import com.example.example.exeption.NotFoundVauleException;
import com.example.example.model.dto.ShipDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(NotFoundVauleException.class)
    public ResponseEntity<NotFoundVauleException> handleIllegalArgumentException(NotFoundVauleException e) {
        return new ResponseEntity<>(,HttpStatus.NOT_FOUND);
    }
}

