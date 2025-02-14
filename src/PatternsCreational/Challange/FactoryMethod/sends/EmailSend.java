package PatternsCreational.Challange.FactoryMethod.sends;

public class EmailSend implements Send{

    private String message;

    public EmailSend(String message) {
        this.message = message;
    }

    @Override
    public void sendMessage() {
        System.out.printf( MessageDefault.SEND_MESSAGE.getDescricao() + " Email " + this.message);
    }

    @Override
    public void findMessage() {
        System.out.println( MessageDefault.FIND_MESSAGE.getDescricao()  + " Email " + this.message);

    }
}
