package com.example.demo.dao;

import com.example.demo.entity.Ride;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class rideDAOImpl implements rideDAO {

    //constructor injection
    private EntityManager entityManager;
    @Autowired
    public rideDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Ride generateRide() {
        Ride _ride = new Ride();
        _ride.setRide_state("Draft");

        entityManager.merge(_ride);

        return entityManager.find(Ride.class, _ride.getRide_id());
    }
}
