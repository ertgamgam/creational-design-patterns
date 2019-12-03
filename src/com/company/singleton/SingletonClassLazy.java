package com.company.singleton;

public class SingletonClassLazy {
    private static SingletonClassLazy SINGLE_INSTANCE = null;

    private SingletonClassLazy() {
    }

    public static SingletonClassLazy getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (SingletonClassLazy.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new SingletonClassLazy();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
}
//https://dzone.com/articles/singleton-in-java