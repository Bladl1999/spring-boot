package com.example.example.advice;

import com.example.example.exeption.NotFoundValueException;
import com.example.example.model.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(NotFoundValueException.class)
    public ResponseEntity<ErrorMessage> handleNotFoundValueException(NotFoundValueException e) {
        ErrorMessage errorMessage = new ErrorMessage(System.currentTimeMillis(),
                HttpStatus.NOT_FOUND.getReasonPhrase(), e.getMessage());
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
}

