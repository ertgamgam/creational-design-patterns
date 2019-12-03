package com.company.singleton;

public class SingletonClassEager {
    private static final SingletonClassEager SINGLE_INSTANCE = new SingletonClassEager();

    private SingletonClassEager() {
    }

    public static SingletonClassEager getInstance() {
        return SINGLE_INSTANCE;
    }
}
