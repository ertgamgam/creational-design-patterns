package com.company.factorymethod;

public class FacebookNotifications implements Notification {

    @Override
    public void send(String message) {

        System.out.println("This one is from facebook = " + message);

    }
}
