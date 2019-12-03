package com.company.abstractfactory.furniture.coffeetable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public int getLength() {
        return 12;
    }

    @Override
    public String getSignature() {
        return "VictorianCoffeeTable";
    }
}
