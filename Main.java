import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the context object — it will use whichever strategy we set
        PaymentContext context = new PaymentContext();

        System.out.println("========================================");
        System.out.println("   Welcome to the Online Payment System  ");
        System.out.println("========================================");

        boolean continuePayment = true;

        while (continuePayment) {

            // Display payment method menu
            System.out.println("\nSelect Payment Method:");
            System.out.println("  1. Credit Card");
            System.out.println("  2. UPI");
            System.out.println("  3. PayPal");
            System.out.println("  0. Exit");
            System.out.print("\nEnter your choice: ");

            // Validate menu choice input
            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Invalid input. Please enter a number (0–3).");
                continue;
            }

            // Exit condition
            if (choice == 0) {
                System.out.println("\nThank you for using the Online Payment System. Goodbye!");
                break;
            }

            // get the strategy object based on user choice
            PaymentStrategy selectedStrategy = PaymentFactory.getPaymentMethod(choice);

            // Handle invalid menu choices
            if (selectedStrategy == null) {
                System.out.println("[ERROR] Invalid choice. Please select 1, 2, or 3.");
                continue;
            }

            // Ask for payment amount
            System.out.print("Enter the amount to pay (₹): ");
            int amount = -1;
            try {
                amount = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("[ERROR] Invalid amount. Please enter a valid integer.");
                continue;
            }

            // Validate amount
            if (amount <= 0) {
                System.out.println("[ERROR] Amount must be greater than ₹0.");
                continue;
            }

            // Set the strategy in context (Strategy Pattern in action)
            context.setStrategy(selectedStrategy);

            // Process the payment via the context
            System.out.println();
            context.processPayment(amount);

            // Ask if the user wants to make another payment
            System.out.print("\nDo you want to make another payment? (yes/no): ");
            String again = scanner.nextLine().trim().toLowerCase();
            if (!again.equals("yes") && !again.equals("y")) {
                continuePayment = false;
                System.out.println("\nThank you for using the Online Payment System. Goodbye!");
            }
        }

        scanner.close();
    }
}
