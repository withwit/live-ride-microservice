package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Table(name = "ride")
@Entity
public class Ride {
    @Id
    @Column(name = "ride_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ride_id;

    @Column(name = "rider_id")
    private Integer rider_id;

    @Column(name = "path_id")
    private Integer path_id;

    @Column(name = "ride_date")
    private Date ride_date;

    @Column(name = "payment_id")
    private Integer payment_id;

    @Column(name = "ride_state")
    private String ride_state;

    public Ride() {
    }

    public Ride(Integer rider_id, Integer path_id, Date ride_date, Integer payment_id, String ride_state) {
        this.rider_id = rider_id;
        this.path_id = path_id;
        this.ride_date = ride_date;
        this.payment_id = payment_id;
        this.ride_state = ride_state;
    }

    public Integer getRide_id() {
        return ride_id;
    }

    public void setRide_id(Integer ride_id) {

        this.ride_id = ride_id;
    }

    public Integer getRider_id() {
        return rider_id;
    }

    public void setRider_id(Integer rider_id) {
        this.rider_id = rider_id;
    }

    public Integer getPath_id() {
        return path_id;
    }

    public void setPath_id(Integer path_id) {
        this.path_id = path_id;
    }

    public Date getRide_date() {
        return ride_date;
    }

    public void setRide_date(Date ride_date) {
        this.ride_date = ride_date;
    }

    public Integer getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Integer payment_id) {
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
