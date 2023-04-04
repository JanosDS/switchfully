package com.switchfully.flyway.car.dto;

public class CreateCarDTO {

    private String type;
    private String color;
    private Double price;

    public CreateCarDTO(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
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
