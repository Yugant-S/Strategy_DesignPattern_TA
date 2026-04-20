public class PaypalPayment implements PaymentStrategy {
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
