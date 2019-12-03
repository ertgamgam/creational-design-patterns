package com.company.abstractfactory.furniture.coffeetable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public int getLength() {
        return 5;
    }

    @Override
    public String getSignature() {
        return "ArtDecoCoffeeTable";
    }
}
