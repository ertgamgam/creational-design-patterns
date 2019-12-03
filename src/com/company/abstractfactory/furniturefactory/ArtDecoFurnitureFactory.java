package com.company.abstractfactory.furniturefactory;

import com.company.abstractfactory.furniture.chair.ArtDecoChair;
import com.company.abstractfactory.furniture.chair.Chair;
import com.company.abstractfactory.furniture.coffeetable.ArtDecoCoffeeTable;
import com.company.abstractfactory.furniture.coffeetable.CoffeeTable;
import com.company.abstractfactory.furniture.sofa.ArtDecoSofa;
import com.company.abstractfactory.furniture.sofa.Sofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa getSofa() {
        return new ArtDecoSofa();
    }
}
