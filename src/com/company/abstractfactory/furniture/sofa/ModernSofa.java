package com.company.abstractfactory.furniture.sofa;

import com.company.abstractfactory.Color;

public class ModernSofa implements Sofa {

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }

    @Override
    public String getSignature() {
        return "ModernSofa";
    }
}
