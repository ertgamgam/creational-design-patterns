package com.company.abstractfactory.furniture.chair;

public class ArtDecoChair implements Chair {
    @Override
    public int getLegCount() {
        return 6;
    }

    @Override
    public String getSignature() {
        return "ArtDecoChair";
    }
}
