package com.switchfully.flyway.car;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_seq")
    @SequenceGenerator(name = "car_seq", sequenceName = "car_seq", allocationSize = 1)
    public Long id;

    private String type;

    private String color;

    private Double price;

    public Car() {

    }

    public Car(String type, String color, Double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Double getPrice() {
        return price;
    }
}
