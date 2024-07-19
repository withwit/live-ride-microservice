package com.example.demo.dao;

import com.example.demo.entity.Ride;

import java.util.List;

public interface rideDAO {
    Ride generateRide();

    List<Ride> getAllRides();

    Ride getRide(int id);
}
