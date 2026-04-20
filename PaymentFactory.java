/**
 * PaymentFactory Class (Factory Design Pattern)
 *
 * Definition:
 * This class acts as a Factory that creates and returns objects
 * of different payment strategies based on user choice.
 *
 * Key Responsibilities:
 * - Encapsulates object creation logic for PaymentStrategy implementations.
 * - Returns the appropriate concrete strategy based on input.
 * - Hides instantiation details from the client.
 *
 * Important Concept:
 * The client does not directly create objects using 'new'.
 * Instead, it requests the factory to provide the required object.
 *
 * Advantages:
 * - Promotes loose coupling between client and concrete classes.
 * - Centralizes object creation logic.
 * - Makes the code easier to maintain and extend.
 *
 * Example Usage:
 * PaymentStrategy strategy = PaymentFactory.getPaymentMethod(1);
 * // Returns CreditCardPayment object
 *
 * Note:
 * If an invalid choice is provided, the method returns null.
 * Proper null handling should be implemented in the client code.
 */

public class PaymentFactory {

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
