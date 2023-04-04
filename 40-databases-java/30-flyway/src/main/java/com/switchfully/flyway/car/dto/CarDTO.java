package com.switchfully.flyway.car.dto;

public class CarDTO {

    private Long id;
    private String type;
    private String color;
    private Double price;

    public CarDTO(Long id, String type, String color, Double price) {
        this.id = id;
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
