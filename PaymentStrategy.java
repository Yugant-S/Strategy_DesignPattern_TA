/**
 * Strategy Interface
 * 
 * This is the core of the Strategy Design Pattern.
 * It declares a common interface for all supported payment algorithms.
 * The PaymentContext uses this interface to call the algorithm defined
 * by a concrete strategy.
 */
public interface PaymentStrategy {

    /**
     * Executes the payment using a specific payment method.
     *
     * @param amount The amount to be paid (in rupees/currency unit)
     */
    void pay(int amount);
}
