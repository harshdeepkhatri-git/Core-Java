import java.util.InputMismatchException;
import java.util.Scanner;

public class BankingApplication {

    static Scanner sc = new Scanner(System.in);

    // customer array and counters
    static Customer[] customers = new Customer[5];
    static int customerCount = 0;
    static int nextAccountNumber = 1001;


    //Display Menu
    static void displayMenu() {
        System.out.println("===============================");
        System.out.println("   BANKING MANAGEMENT SYSTEM");
        System.out.println("===============================");


        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");

    }

    // Create account
    public static void createAccount() {

        if (customerCount == customers.length) {
            System.out.println("Bank cannot create more accounts. ");
            return;
        }

        //Customer details.

        System.out.println("Enter customer name: ");
        String name = sc.nextLine();


        System.out.println("Enter phone number: ");
        String phone = sc.nextLine();


        System.out.println("Enter initial deposit: ");
        double deposit = sc.nextDouble();
        sc.nextLine();


        // Validate initial deposit

        if ((deposit < 500)) {
            System.out.println("Minimum initial deposit should be 500 !! ");
            return;
        }


        // Generate account number

        int accountNumber = nextAccountNumber;

        // create customer object

        Customer customer = new Customer(accountNumber, name, phone, deposit);

        //store object in an array
        customers[customerCount] = customer;

        //update counters
        customerCount++;
        nextAccountNumber++;


        System.out.println("\nAccount Created Successfully");

        displayAccountDetails(customer);

        //Display customer details

    }

    private static void depositMoney() {
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getAccountNumber() == accountNumber) {
                found = true;
                System.out.println("Account found");
                System.out.println("Customer: " + customers[i].getCustomerName());

                // Deposite amount input
                System.out.println("Enter amount to be deposited: ");
                double amount = sc.nextDouble();

                // Validate amount

                if (amount <= 0) {
                    System.out.println("Invalid deposite amount!");
                    return;
                }

                // Get exisiting balance
                double oldbalance = customers[i].getBalance();

                // Calculate new Balance
                double newBalance = oldbalance + amount;

                // update balance
                customers[i].setBalance(newBalance);

                //Display updated balance
                System.out.println("\nMoney deposited Successfully!");
                System.out.println("Previous Balance: " + oldbalance);
                System.out.println("Deposited Amount: " + amount);
                System.out.println("Updated Balance: " + customers[i].getBalance());

                break;

            }
        }
        // Account not Found

        if (!found) {
            System.out.println("Account not found");
        }

    }

    private static void withdrawMoney() {
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < customerCount; i++) {
            if (customers[i].getAccountNumber() == accountNumber) {
                found = true;
                System.out.println("Account found");
                System.out.println("Customer: " + customers[i].getCustomerName());

                System.out.println("Enter amount to be withdrawn: ");
                double amount = sc.nextDouble();

                // Validate withdrawal amount
                if (amount <= 0) {
                    System.out.println("Invalid withdrawn amount!");
                    return;
                }

                // Check sufficient balance
                double oldbalance = customers[i].getBalance();

                // check sufficient balance
                if (amount > oldbalance) {
                    System.out.println("Insufficient balance!");
                    return;
                }

                // calculate new balance
                double newBalance = oldbalance - amount;

                // Update balance
                customers[i].setBalance(newBalance);

                System.out.println("\nMoney withdrawn Successfully!");
                System.out.println("Previous Balance: " + oldbalance);
                System.out.println("Withdraw Amount: " + amount);
                System.out.println("Updated Balance: " + customers[i].getBalance());
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found");
        }
    }

    private static void checkBalance() {
        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < customerCount; i++){
            if(customers[i].getAccountNumber() == accountNumber){
                found = true;

                System.out.println("Account found");
                System.out.println("Customer: "+ customers[i].getCustomerName());
                System.out.println("Available Balance: "+ customers[i].getBalance());
                break;
            }
        }
        if (!found) {
            System.out.println("Account not found");
        }
    }


   static void displayAccountDetails(Customer customer){
       System.out.println("Account Number: " + customer.getAccountNumber());
       System.out.println("Customer Name: " + customer.getCustomerName());
       System.out.println("Phone Number: " + customer.getPhoneNumber());
       System.out.println("Balance: " + customer.getBalance());
   }


    static void handleChoice(int choice) {
        switch (choice) {

            default:
                System.out.println("Invalid choice");
                break;

            case 1:
               createAccount();
                break;

                case 2:
                     depositMoney();
                break;

            case 3:
               withdrawMoney();
                break;

            case 4:
                checkBalance();
                break;

            case 5:
                System.out.println("Thank you for using our banking system !");
                break;

        }
    }




    public static void main(String[] args) {

    int choice = 0;

    do {

        displayMenu();

        System.out.println("Enter your choice");

        try {
            choice = sc.nextInt();
            sc.nextLine();

            handleChoice(choice);
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number.");

            sc.nextLine();
        }

        System.out.println();
    }
    while (choice != 5);
    sc.close();

  }
}






