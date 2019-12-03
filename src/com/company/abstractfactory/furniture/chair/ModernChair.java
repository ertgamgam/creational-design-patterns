package com.company.abstractfactory.furniture.chair;

public class ModernChair implements Chair {

    @Override
    public int getLegCount() {
        return 5;
    }

    @Override
    public String getSignature() {
        return "ModernChair";
    }
}
