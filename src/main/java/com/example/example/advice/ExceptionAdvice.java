package com.example.example.advice;

import com.example.example.exeption.NotFoundVauleException;
import com.example.example.model.dto.ErrorMessage;
import com.example.example.model.dto.ShipDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(NotFoundVauleException.class)
    public ResponseEntity<ErrorMessage> handleNotFoundVauleException(NotFoundVauleException e) {
        ErrorMessage errorMessage = new ErrorMessage(System.currentTimeMillis(),
                HttpStatus.NOT_FOUND.getReasonPhrase(), e.getMessage());
        return new ResponseEntity<>(errorMessage,HttpStatus.NOT_FOUND);
    }
}

