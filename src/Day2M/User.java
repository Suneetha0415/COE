public class User {
        private String username;
        private String password;
        User(String username, String password) {
            this.username = username;
            setPassword(password); 
        }
        public String getUsername() {
            return username;
        }
        public void setPassword(String password) {
            if (password.length() >= 8) {
                this.password = password;
                System.out.println("Password set successfully.");
            } else {
                System.out.println("Error: Password must be at least 8 characters long.");
            }
        }
        public void displayUser() {
            System.out.println("Username: " + username);
        }
        public static void main(String[] args) {
            User user1 = new User("john_doe", "securePass"); 
            User user2 = new User("alice_smith", "12345"); 
    
            user1.displayUser(); 
            user2.displayUser(); 
            user2.setPassword("newSecureP@ss"); 
        }
    }
    
    

