package com.company.factorymethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("test");

        Notification anotherNotification= new FacebookNotifications();
        anotherNotification.send("message received");

        Notification myNotification=NotificationFactory.buildNotification(NotificationType.INSTAGRAM);
        myNotification.send("message received");
    }
}
