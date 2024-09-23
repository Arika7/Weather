package com.example.weatherapp.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Location {


    @Id
    private Long id;


    private String name;

    @ManyToOne
    private User owner;


    Double Latitude;

    Double Longitude;

}
