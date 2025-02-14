package PatternsCreational.Challange.FactoryMethod.sends;

public class SMSSend implements Send{

    private String message;

    public SMSSend(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.println( MessageDefault.SEND_MESSAGE.getDescricao()  + " SMS " + this.message);
    }

    @Override
    public void findMessage() {
        System.out.println( MessageDefault.FIND_MESSAGE.getDescricao()  + " SMS " + this.message);
    }
}
