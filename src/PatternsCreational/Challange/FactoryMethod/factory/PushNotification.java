package PatternsCreational.Challange.FactoryMethod.factory;

import PatternsCreational.Challange.FactoryMethod.sends.PushSend;
import PatternsCreational.Challange.FactoryMethod.sends.Send;

public class PushNotification extends Notification{

    @Override
    public Send createSend(String message) {
        return new PushSend(message);
    }
}
