package com.example.demo.rest;


import com.example.demo.entity.Ride;
import com.example.demo.rest.error.ErrorResponse;
import com.example.demo.rest.error.RideNotFoundException;
import com.example.demo.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private RideService rideService;

    @Autowired
    public RestController(RideService r) {
        rideService = r;
    }

    @GetMapping("/ride")
    public Ride generateRide() {
        Ride result = rideService.generateRide();
        return result;
    }

    @GetMapping("/")
    public List<Ride> getAllRides() {
        List<Ride> result = rideService.getAllRides();
        return result;
    }

    @GetMapping("/ride/{id}")
    public Ride getRide(@PathVariable int id) {

        Optional<Ride> didGet = Optional.ofNullable(rideService.getRide(id));

        if (didGet.isPresent()) {
            return rideService.getRide(id);
        } else {
            throw new RideNotFoundException("No ride found with mentioned id: " + id);
        }
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(RideNotFoundException e){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> baseExceptionHandler(Exception e){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage(e.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
