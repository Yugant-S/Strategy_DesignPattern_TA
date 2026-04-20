/**
 * Concrete Strategy 2: UPI Payment
 *
 * Implements the PaymentStrategy interface for UPI (Unified Payments Interface)
 * transactions. UPI is a real-time payment system commonly used in India.
 * In a real-world scenario, this would integrate with UPI APIs.
 */
public class UPIPayment implements PaymentStrategy {

    /**
     * Processes payment via UPI.
     *
     * @param amount The amount to be paid
     */
    @Override
    public void pay(int amount) {
        System.out.println("------------------------------------");
        System.out.println("  Payment Method : UPI");
        System.out.println("  Amount Paid    : ₹" + amount);
        System.out.println("  Status         : SUCCESS ✔");
        System.out.println("  Message        : Paid ₹" + amount + " using UPI.");
        System.out.println("------------------------------------");
    }
}
