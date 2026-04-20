/**
 * Factory Class: PaymentFactory
 *
 * Implements the Factory Design Pattern to decouple object creation
 * from the main application logic.
 *
 * Instead of using "new CreditCardPayment()" directly in Main,
 * we delegate that responsibility to this factory class.
 * This makes the code more maintainable — adding a new payment method
 * only requires updating this factory, not the entire application.
 */
public class PaymentFactory {

    /**
     * Returns the appropriate PaymentStrategy object based on user's choice.
     *
     * This static factory method uses a switch-case to map user input
     * to the correct concrete strategy implementation.
     *
     * @param choice Integer representing the user's chosen payment method
     *               1 -> Credit Card
     *               2 -> UPI
     *               3 -> PayPal
     * @return A PaymentStrategy object, or null if choice is invalid
     */
    public static PaymentStrategy getPaymentMethod(int choice) {
        switch (choice) {
            case 1:
                return new CreditCardPayment();  // Concrete Strategy 1
            case 2:
                return new UPIPayment();          // Concrete Strategy 2
            case 3:
                return new PaypalPayment();        // Concrete Strategy 3
            default:
                return null;                       // Invalid choice
        }
    }
}
