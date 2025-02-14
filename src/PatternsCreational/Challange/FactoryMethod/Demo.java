package PatternsCreational.Challange.FactoryMethod;

import PatternsCreational.Challange.FactoryMethod.factory.EmailNotification;
import PatternsCreational.Challange.FactoryMethod.factory.Notification;
import PatternsCreational.Challange.FactoryMethod.factory.PushNotification;
import PatternsCreational.Challange.FactoryMethod.factory.SMSNotification;

import java.util.Scanner;

public class Demo {

     static Notification notification;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inputOfData = s.nextLine();
        switch (inputOfData.toUpperCase()){
            case "EMAIL":
                notification = new EmailNotification();
                break;
            case "SMS":
                notification = new SMSNotification();
                break;
            case "PUSH":
                notification = new PushNotification();
                break;
            default:
                notification = null;
                System.out.println("Nenhuma mensagem identifica");
                break;
        }

        if(notification != null) {
            notification.sendMessage("Mensagem automatica");
        }
    }
}
