import java.util.Scanner;

public class BankingApplication {

    static void displayMenu() {
        System.out.println("===============================");
        System.out.println("   BANKING MANAGEMENT SYSTEM");
        System.out.println("===============================");

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");

    }


    static void handleChoce(int choice) {
        switch (choice) {

            default:
                System.out.println("Invalid choice");
                break;

            case 1:
                System.out.println("Create Account feature coming soon");
                break;

            case 2:
                System.out.println("Deposit Money feature coming soon");
                break;

            case 3:
                System.out.println("Withdraw Money feature coming soon");
                break;

            case 4:
                System.out.println("Balance Inquiry feature coming soon");
                break;

            case 5:
                System.out.println("Thank you for using our banking system !");
                break;


        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            handleChoce(choice);

            System.out.println();
        }
        while (choice != 5);
        sc.close();

    }
}





