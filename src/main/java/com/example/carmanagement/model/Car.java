package com.example.carmanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    private String model;

    @Min(1886)  // First car invented in 1886
    @Max(2100)
    private int year;

    @Positive
    private double price;

    @NotBlank
    private String color;

    @NotBlank
    private String fuelType;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotBlank String getModel() {
        return model;
    }

    public void setModel(@NotBlank String model) {
        this.model = model;
    }

    @Min(1886)
    @Max(2100)
    public int getYear() {
        return year;
    }

    public void setYear(@Min(1886) @Max(2100) int year) {
        this.year = year;
    }

    @Positive
    public double getPrice() {
        return price;
    }

    public void setPrice(@Positive double price) {
        this.price = price;
    }

    public @NotBlank String getColor() {
        return color;
    }

    public void setColor(@NotBlank String color) {
        this.color = color;
    }

    public @NotBlank String getFuelType() {
        return fuelType;
    }

    public void setFuelType(@NotBlank String fuelType) {
        this.fuelType = fuelType;
    }
}