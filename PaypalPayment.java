/**
 * Concrete Strategy 3: PayPal Payment
 *
 * Implements the PaymentStrategy interface for PayPal transactions.
 * PayPal is a widely used online payment platform.
 * In a real-world scenario, this would use the PayPal REST API for processing.
 */
public class PaypalPayment implements PaymentStrategy {

    /**
     * Processes payment via PayPal.
     *
     * @param amount The amount to be paid
     */
    @Override
    public void pay(int amount) {
        System.out.println("------------------------------------");
        System.out.println("  Payment Method : PayPal");
        System.out.println("  Amount Paid    : ₹" + amount);
        System.out.println("  Status         : SUCCESS ✔");
        System.out.println("  Message        : Paid ₹" + amount + " using PayPal.");
        System.out.println("------------------------------------");
    }
}
