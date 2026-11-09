public class Customer {
    private int accountNumber;
    private String customerName;
    private String phoneNumber;
    private double balance;

   public Customer(int accountNumber, String customerName, String phoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

        public void setAccountNumber(int accountNumber) {

           this.accountNumber = accountNumber;
        }
        public void setCustomerName(String customerName) {

           this.customerName = customerName;
        }
        public void setPhoneNumber(String phoneNumber) {

           this.phoneNumber = phoneNumber;
        }

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public int getAccountNumber() {

               return accountNumber;
            }

            public String getCustomerName() {
                return customerName;

            }

            public String getPhoneNumber() {

               return phoneNumber;
            }

                public double getBalance() {

                   return balance;
                }

}
