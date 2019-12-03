package com.company.abstractfactory;

import com.company.abstractfactory.furniture.chair.Chair;
import com.company.abstractfactory.furniture.coffeetable.CoffeeTable;
import com.company.abstractfactory.furniture.sofa.Sofa;
import com.company.abstractfactory.furniturefactory.FurnitureFactory;

public class FurnitureClient {

    private final FurnitureFactory furnitureFactory;

    public FurnitureClient(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void getInfoAboutFurniture() {
        Sofa sofa = furnitureFactory.getSofa();
        Chair chair = furnitureFactory.getChair();
        CoffeeTable coffeeTable = furnitureFactory.getCoffeeTable();

        StringBuilder stringBuilder = new StringBuilder();
        String info = stringBuilder.append("Sofa info = ").append(sofa.getSignature()).append("  ").append("Color = ").append(sofa.getColor())
                .append("\n")
                .append("Chair info = ").append(chair.getSignature()).append("  ").append("LegCount = ").append(chair.getLegCount())
                .append("\n")
                .append("CoffeeTable = ").append(coffeeTable.getSignature()).append("  ").append("Length = ").append(coffeeTable.getLength())
                .toString();

        System.out.println(info);
    }
}
