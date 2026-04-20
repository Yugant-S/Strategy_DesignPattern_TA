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
