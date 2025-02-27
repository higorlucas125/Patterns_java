package PatternsBahavioral.LearningStrategy.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetaisl();
}
