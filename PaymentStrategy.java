/**
 * PaymentStrategy Interface (Strategy Design Pattern)
 *
 * Definition:
 * This interface defines the common contract for all payment methods.
 * It declares the pay() method that must be implemented by all
 * concrete payment strategy classes.
 *
 * Key Responsibilities:
 * - Provides a standard method (pay) for different payment strategies.
 * - Ensures all payment methods follow a common structure.
 *
 * Important Concept:
 * This interface enables polymorphism, allowing the Context
 * (PaymentContext) to work with different payment methods
 * interchangeably without knowing their implementation details.
 *
 * Advantages:
 * - Promotes flexibility and extensibility.
 * - New payment methods can be added without modifying existing code.
 * - Supports runtime selection of algorithms (payment methods).
 *
 * Example Implementations:
 * - CreditCardPayment
 * - UPIPayment
 * - PaypalPayment
 */

public interface PaymentStrategy {
    void pay(int amount);
}
