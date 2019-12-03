package com.company.abstractfactory.furniture.coffeetable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public int getLength() {
        return 7;
    }

    @Override
    public String getSignature() {
        return "ModernCoffeeTable";
    }
}
