package com.company.abstractfactory.furniturefactory;

import com.company.abstractfactory.furniture.chair.Chair;
import com.company.abstractfactory.furniture.chair.ModernChair;
import com.company.abstractfactory.furniture.coffeetable.CoffeeTable;
import com.company.abstractfactory.furniture.coffeetable.ModernCoffeeTable;
import com.company.abstractfactory.furniture.sofa.ModernSofa;
import com.company.abstractfactory.furniture.sofa.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }
}
