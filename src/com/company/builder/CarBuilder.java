package com.company.builder;

public final class CarBuilder {
    private int maxSpeed;
    private String brand;
    private String color;
    private String type;

    private CarBuilder() {
    }

    public static CarBuilder aCar() {
        return new CarBuilder();
    }

    public CarBuilder withMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public CarBuilder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setMaxSpeed(maxSpeed);
        car.setBrand(brand);
        car.setColor(color);
        car.setType(type);
        return car;
    }
}
