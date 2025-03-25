// Class: Payment
public class Payment {
    // Method 1: Pay using the default payment method
        void pay(double amount) {
            System.out.println("Paid Rs. " + amount + " using default payment method.");
        }
    
        // Method 2: Pay using a specific method
        void pay(double amount, String method) {
            System.out.println("Paid Rs. " + amount + " using " + method + ".");
        }
    
        // Method 3: Pay using EMI with a specified duration
        void pay(double amount, String method, int emiMonths) {
            System.out.println("Paid Rs. " + amount + " using " + method + " in " + emiMonths + " EMI months.");
        }
    
        // Main method to demonstrate different payments
        public static void main(String[] args) {
            Payment p = new Payment();
            p.pay(1000); // Default payment
            p.pay(2000, "Credit Card"); // Specific payment method
            p.pay(5000, "UPI", 12); // EMI payment
        }
    }
    
    

