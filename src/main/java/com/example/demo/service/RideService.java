package com.example.demo.service;

import com.example.demo.entity.Ride;

import java.util.List;

public interface RideService {
    List<Ride> getAllRides();

    Ride generateRide();

    Ride getRide(int id);
}
