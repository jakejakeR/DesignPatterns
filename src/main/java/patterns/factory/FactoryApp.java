package patterns.factory;

import patterns.factory.notifications.Notification;
import patterns.factory.notifications.NotificationFactory;

public class FactoryApp {

    public static void main(String[] args) {

        System.out.println("Factory design pattern practice\r\n");

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
