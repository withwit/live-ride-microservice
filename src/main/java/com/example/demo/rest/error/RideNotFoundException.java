package com.example.demo.rest.error;

public class RideNotFoundException extends RuntimeException {
    public RideNotFoundException(String message) {
        super(message);
    }

    public RideNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RideNotFoundException(Throwable cause) {
        super(cause);
    }
}
