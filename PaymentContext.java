/**
 * Context Class: PaymentContext
 *
 * This class is the "Context" in the Strategy Design Pattern.
 * It holds a reference to one of the concrete strategies and
 * communicates with this object only via the PaymentStrategy interface.
 *
 * Key benefit: The context does NOT know which strategy is being used —
 * this enables runtime behavior switching without changing the context code.
 */
public class PaymentContext {

    // Holds the current payment strategy (set at runtime)
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(int amount) {
        if (strategy == null) {
            System.out.println("[ERROR] No payment strategy selected. Please choose a payment method.");
            return;
        }
        strategy.pay(amount);
    }
}
