/**
 * Concrete Strategy 1: Credit Card Payment
 *
 * Implements the PaymentStrategy interface for Credit Card transactions.
 * In a real-world scenario, this class would contain credit card
 * number validation, bank API calls, etc.
 */
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("------------------------------------");
        System.out.println("  Payment Method : Credit Card");
        System.out.println("  Amount Paid    : ₹" + amount);
        System.out.println("  Status         : SUCCESS ✔");
        System.out.println("  Message        : Paid ₹" + amount + " using Credit Card.");
        System.out.println("------------------------------------");
    }
}
