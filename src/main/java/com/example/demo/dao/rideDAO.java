package com.example.demo.dao;

import com.example.demo.entity.Ride;

import java.util.List;
import java.util.UUID;

public interface rideDAO {
    Ride generateRide();
    List<Ride> getAllRides();
}
