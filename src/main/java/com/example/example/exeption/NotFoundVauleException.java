package com.example.example.exeption;


public class NotFoundVauleException extends RuntimeException {


    public NotFoundVauleException() {
    }

    public NotFoundVauleException(String message) {
        super(message);
    }

    public NotFoundVauleException(String message, Throwable cause) {
        super(message, cause);
    }
}