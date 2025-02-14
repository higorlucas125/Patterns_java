package PatternsCreational.Challange.FactoryMethod.factory;

import PatternsCreational.Challange.FactoryMethod.sends.Send;

public abstract class Notification {
    public void sendMessage (String message){

        Send send = createSend(message);
        send.sendMessage();

    }

    public void findMessage(String message){

        Send send = createSend(message);
        send.findMessage();
    }


    public abstract Send createSend(String message);
}
