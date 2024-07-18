package com.example.demo.rest;


import com.example.demo.dao.rideDAO;
import com.example.demo.entity.Ride;
import com.example.demo.service.RideService;
import com.example.demo.service.RideServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private RideService rideService;
    @Autowired
    public RestController(RideService r){
        rideService=r;
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
}
