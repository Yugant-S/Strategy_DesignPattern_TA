/**
 * PaymentContext Class (Context in Strategy Design Pattern)
 *
 * Definition:
 * This class represents the Context in the Strategy Design Pattern.
 * It maintains a reference to a PaymentStrategy object and delegates
 * the payment execution responsibility to the selected strategy.
 *
 * Key Responsibilities:
 * - Stores a reference to the current payment strategy.
 * - Allows changing the strategy dynamically at runtime using setStrategy().
 * - Delegates the payment processing task to the selected strategy.
 *
 * Important Concept:
 * The Context does not know the internal working of the strategy.
 * It only interacts through the common PaymentStrategy interface.
 *
 * Advantages:
 * - Promotes loose coupling between context and strategy.
 * - Enables runtime switching of algorithms (payment methods).
 * - Eliminates the need for multiple conditional statements (if-else or switch).
 *
 * Example Usage:
 * PaymentContext context = new PaymentContext();
 * context.setStrategy(new CreditCardPayment());
 * context.processPayment(5000);
 *
 * If needed, strategy can be changed at runtime:
 * context.setStrategy(new UPIPayment());
 * context.processPayment(2000);
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
