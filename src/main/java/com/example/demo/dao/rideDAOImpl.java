package com.example.demo.dao;

import com.example.demo.entity.Ride;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
@Repository
public class rideDAOImpl implements rideDAO {

    //constructor injection
    private EntityManager entityManager;
    @Autowired
    public rideDAOImpl(EntityManager em) {
        entityManager = em;
    }

    @Override
    @Transactional
    public Ride generateRide() {
        Ride _ride = new Ride();
        _ride.setRide_id(1212);
        _ride.setRide_state("Draft");
        _ride.setPath_id(000);
        _ride.setRide_date(Date.from(Instant.now()));
        _ride.setPayment_id(000);
        _ride.setRider_id(000);



        entityManager.persist(_ride);

        return _ride;
    }
}
