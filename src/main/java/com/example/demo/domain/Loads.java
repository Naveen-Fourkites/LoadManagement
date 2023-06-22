package com.example.navdi.Domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Loads {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long shipment_id;
    private String number;
    private Long carrier_id;

    public Loads() {
    }

    public Loads(Long shipment_id, Long id, String number, Long carrier_id) {
        this.shipment_id = shipment_id;
        this.id = id;
        this.number = number;
        this.carrier_id = carrier_id;
    }

    //getter setter for all the fields..................
    public Long getShipment_id() {
        return shipment_id;
    }

    public void setShipment_id(Long shipment_id) {
        this.shipment_id = shipment_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getCarrier_id() {
        return carrier_id;
    }

    public void setCarrier_id(Long carrier_id) {
        this.carrier_id = carrier_id;
    }
}
