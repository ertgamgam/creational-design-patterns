package com.company.abstractfactory;

import com.company.abstractfactory.furniturefactory.VictorianFurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureClient client = new FurnitureClient(new VictorianFurnitureFactory());
        client.getInfoAboutFurniture();
    }
}
