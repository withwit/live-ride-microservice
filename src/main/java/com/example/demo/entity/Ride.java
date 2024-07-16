package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name="ride")
@Entity
public class Ride {
    @Id
    @Column(name = "ride_id")
    @GeneratedValue
    private UUID ride_id;

    @Column(name="rider_id")
    private UUID rider_id;

    @Column(name="path_id")
    private UUID path_id;

    @Column(name="ride_date")
    private UUID ride_date;

    @Column(name="payment_id")
    private UUID payment_id;

    @Column(name="ride_state")
    private String ride_state;

    public Ride() {
    }

    public Ride(UUID rider_id, UUID path_id, UUID ride_date, UUID payment_id, String ride_state) {
        this.rider_id = rider_id;
        this.path_id = path_id;
        this.ride_date = ride_date;
        this.payment_id = payment_id;
        this.ride_state = ride_state;
    }
    public UUID getRide_id() {
        return ride_id;
    }

    public void setRide_id(UUID ride_id) {
        this.ride_id = ride_id;
    }

    public UUID getRider_id() {
        return rider_id;
    }

    public void setRider_id(UUID rider_id) {
        this.rider_id = rider_id;
    }

    public UUID getPath_id() {
        return path_id;
    }

    public void setPath_id(UUID path_id) {
        this.path_id = path_id;
    }

    public UUID getRide_date() {
        return ride_date;
    }

    public void setRide_date(UUID ride_date) {
        this.ride_date = ride_date;
    }

    public UUID getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(UUID payment_id) {
        this.payment_id = payment_id;
    }

    public String getRide_state() {
        return ride_state;
    }

    public void setRide_state(String ride_state) {
        this.ride_state = ride_state;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "ride_id=" + ride_id +
                ", rider_id=" + rider_id +
                ", path_id=" + path_id +
                ", ride_date=" + ride_date +
                ", payment_id=" + payment_id +
                ", ride_state='" + ride_state + '\'' +
                '}';
    }
}
