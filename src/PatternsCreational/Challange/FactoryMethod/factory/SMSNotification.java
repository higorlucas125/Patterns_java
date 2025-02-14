package PatternsCreational.Challange.FactoryMethod.factory;

import PatternsCreational.Challange.FactoryMethod.sends.SMSSend;
import PatternsCreational.Challange.FactoryMethod.sends.Send;

public class SMSNotification extends Notification {

    @Override
    public Send createSend(String message) {
        return new SMSSend(message);
    }
}
