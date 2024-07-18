package com.example.demo.dao;

import com.example.demo.entity.Ride;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Repository
public class rideDAOImpl implements rideDAO {

    //constructor injection
    private EntityManager entityManager;
    Random rand = new Random();
    @Autowired
    public rideDAOImpl(EntityManager em) {
        entityManager = em;
    }

    @Override
    public Ride generateRide() {
        Ride _ride = new Ride();
//        _ride.setRide_id(rand.nextInt(1000));
        _ride.setRide_state("Draft");
        _ride.setPath_id(000);
        _ride.setRide_date(Date.from(Instant.now()));
        _ride.setPayment_id(000);
        _ride.setRider_id(000);



        entityManager.persist(_ride);

        return entityManager.find(Ride.class,_ride.getRide_id());
    }

    @Override
    public List<Ride> getAllRides() {
        // the table name is JPA and not table name in DB
        TypedQuery<Ride> theQuery =entityManager.createQuery("from Ride",Ride.class);
        return theQuery.getResultList();
    }
}
