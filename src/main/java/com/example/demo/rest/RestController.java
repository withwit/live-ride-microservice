package com.example.demo.rest;


import com.example.demo.dao.rideDAO;
import com.example.demo.entity.Ride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private rideDAO rideDAO;
    @Autowired
    public RestController(rideDAO rideDAO) {
        this.rideDAO = rideDAO;
    }

    @GetMapping("/ride")
    public Ride generateRide() {
        Ride result = rideDAO.generateRide();
        return result;
    }
}
