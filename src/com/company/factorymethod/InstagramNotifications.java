package com.company.factorymethod;

public class InstagramNotifications implements Notification {
    @Override
    public void send(String message) {

        System.out.println("this one is from instagram' = " + message);

    }
}
