package com.company.abstractfactory.furniture.sofa;

import com.company.abstractfactory.Color;

public class ArtDecoSofa implements Sofa {

    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    @Override
    public String getSignature() {
        return "ArtDecoSofa";
    }
}
