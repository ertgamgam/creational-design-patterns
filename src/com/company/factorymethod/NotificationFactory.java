package com.company.factorymethod;

public class NotificationFactory {

    static Notification buildNotification(NotificationType notificationType) {
        switch (notificationType) {
            case FACEBOOK:
                return new FacebookNotifications();
            case TWITTER:
                return new TwitterNotifications();
            case INSTAGRAM:
                return new InstagramNotifications();
            default:
                return null;
        }
    }

}
