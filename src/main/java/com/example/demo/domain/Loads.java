package com.example.demo.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loads {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int shipment_id;
    private String number;
    private int carrier_id;

    public Loads() {
    }

    public Loads(int shipment_id, String number, int carrier_id) {
        this.shipment_id = shipment_id;
        this.number = number;
        this.carrier_id = carrier_id;
    }

    //getter setter for all the fields..................
    public int getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(int shipment_id) {
        this.shipment_id = shipment_id;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCarrier_id() {
        return carrier_id;
    }

    public void setCarrier_id(int carrier_id) {
        this.carrier_id = carrier_id;
    }
}
