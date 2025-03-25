public class BankAccount {
        private double balance;
        private String owner;
        BankAccount() {
            this(0, "Unknown"); 
        }
        BankAccount(double balance) {
            this(balance, "Unknown"); 
        }
        BankAccount(double balance, String owner) {
            this.balance = balance;
            this.owner = owner;
        }
        void displayAccount() {
            System.out.println("Owner: " + owner + ", Balance: Rs. " + balance);
        }
        public static void main(String[] args) {
            BankAccount acc1 = new BankAccount();
            BankAccount acc2 = new BankAccount(1000);
            BankAccount acc3 = new BankAccount(5000, "John Doe");
    
            acc1.displayAccount(); // Owner: Unknown, Balance: Rs. 0.0
            acc2.displayAccount(); // Owner: Unknown, Balance: Rs. 1000.0
            acc3.displayAccount(); // Owner: John Doe, Balance: Rs. 5000.0
        }
    }
    
    

