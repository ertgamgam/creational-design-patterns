package com.company.abstractfactory.furniture.sofa;

import com.company.abstractfactory.Color;

public class VictorianSofa implements Sofa {

    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public String getSignature() {
        return "VictorianSofa";
    }
}
