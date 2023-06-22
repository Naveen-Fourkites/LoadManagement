package com.example.navdi.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pallet {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long count;
    private Long weight;


    public Pallet() {
    }

    public Pallet(Long id, Long count, Long weight) {
        this.id = id;
        this.count = count;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}
