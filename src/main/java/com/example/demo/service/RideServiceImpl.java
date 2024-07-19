package com.example.demo.service;

import com.example.demo.dao.rideDAO;
import com.example.demo.entity.Ride;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {
    private rideDAO rideDao;

    @Autowired
    public RideServiceImpl(rideDAO r) {
        rideDao = r;
    }

    @Transactional
    @Override
    public Ride generateRide() {
        return rideDao.generateRide();
    }

    @Override
    public List<Ride> getAllRides() {
        return rideDao.getAllRides();
    }

    @Override
    public Ride getRide(int id) {
        return rideDao.getRide(id);
    }
}
