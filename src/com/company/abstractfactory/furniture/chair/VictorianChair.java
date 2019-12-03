package com.company.abstractfactory.furniture.chair;

public class VictorianChair implements Chair {

    @Override
    public int getLegCount() {
        return 4;
    }

    @Override
    public String getSignature() {
        return "VictorianChair";
    }
}