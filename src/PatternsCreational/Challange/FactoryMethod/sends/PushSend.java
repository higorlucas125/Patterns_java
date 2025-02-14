package PatternsCreational.Challange.FactoryMethod.sends;

public class PushSend implements Send{
    private String message;

    public PushSend(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.printf( MessageDefault.SEND_MESSAGE.getDescricao()  + " Push " + this.message);
    }

    @Override
    public void findMessage() {
        System.out.println( MessageDefault.FIND_MESSAGE.getDescricao()  + " Push " + this.message);

    }
}
