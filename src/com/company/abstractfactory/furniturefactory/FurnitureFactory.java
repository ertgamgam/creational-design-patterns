package com.company.abstractfactory.furniturefactory;

import com.company.abstractfactory.furniture.chair.Chair;
import com.company.abstractfactory.furniture.coffeetable.CoffeeTable;
import com.company.abstractfactory.furniture.sofa.Sofa;

public interface FurnitureFactory {
    Chair getChair();

    CoffeeTable getCoffeeTable();

    Sofa getSofa();
}
