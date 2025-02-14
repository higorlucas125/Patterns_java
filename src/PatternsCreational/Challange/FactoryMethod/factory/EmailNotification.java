package PatternsCreational.Challange.FactoryMethod.factory;

import PatternsCreational.Challange.FactoryMethod.sends.EmailSend;
import PatternsCreational.Challange.FactoryMethod.sends.Send;

public class EmailNotification extends Notification{

    @Override
    public Send createSend(String message) {
        return new EmailSend(message);
    }
}
