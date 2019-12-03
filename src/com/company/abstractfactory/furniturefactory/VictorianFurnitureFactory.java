package com.company.abstractfactory.furniturefactory;

import com.company.abstractfactory.furniture.chair.Chair;
import com.company.abstractfactory.furniture.chair.VictorianChair;
import com.company.abstractfactory.furniture.coffeetable.CoffeeTable;
import com.company.abstractfactory.furniture.coffeetable.VictorianCoffeeTable;
import com.company.abstractfactory.furniture.sofa.Sofa;
import com.company.abstractfactory.furniture.sofa.VictorianSofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }
}
