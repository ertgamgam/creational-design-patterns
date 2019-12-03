package com.company.factorymethod;

public class TwitterNotifications implements Notification {
    @Override
    public void send(String message) {

        System.out.println("this one is from twitter = " + message);

    }
}
