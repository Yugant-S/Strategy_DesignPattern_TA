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

    /**
     * Sets (or switches) the payment strategy at runtime.
     * This is what makes the Strategy Pattern powerful — we can change
     * the algorithm (payment method) on the fly.
     *
     * @param strategy The payment strategy to use
     */
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Delegates the payment processing to the currently set strategy.
     * The context does not implement the payment logic itself.
     *
     * @param amount The amount to process
     */
    public void processPayment(int amount) {
        if (strategy == null) {
            System.out.println("[ERROR] No payment strategy selected. Please choose a payment method.");
            return;
        }
        strategy.pay(amount);
    }
}
