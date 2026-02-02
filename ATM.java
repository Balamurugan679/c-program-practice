import java.util.Scanner;

public class ATM {
    public static double deposit(double bal, double amount) {
        bal = bal + amount;
        return bal;
    }
    
    public static double withdraw(double bal, double amount) {
        if (bal > amount) {
            bal = bal - amount;
        }
        else {
            System.out.println("You have low balance");
        }
        return bal;
    }

    public static void show_balance(double bal) {
        System.out.println("Your current balence is $ " + bal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double bal = 0;
        int choice;
        double amount;
        do{
            System.out.println("-------------------------");
            System.out.println("------------ATM----------");
            System.out.println("1. Deposit ");
            System.out.println("2. withdraw ");   
            System.out.println("3. Check Balance ");
            System.out.println("4. exit");
            System.out.println("-------------------------");
            System.out.print("Enter your choice (1-4):");
            choice = scan.nextInt();
            System.out.println("-------------------------");
            switch (choice) {
                case 1:
                    System.out.println("your current balance : $" + bal);
                    System.out.print("enter amount to deposit : $");
                    amount = scan.nextInt();
                    bal = deposit(bal, amount);
                    System.out.println("your after dposit balance : $" + bal);
                    break;
                case 2:
                    System.out.println("your current balance : $" + bal);
                    System.out.print("enter amount to withdraw : $");
                    amount = scan.nextInt();
                    bal = withdraw(bal, amount);
                    System.out.println("your after dposit balance : $" + bal);
                    break;
                case 3:
                    show_balance(bal);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us ");
                    System.out.println("-------------------------");
                    break;
                default:
                    System.out.println("Invalid choice ");
                    System.out.println("-------------------------");
                    
            }
       
        } while (choice != 4);
        scan.close();
    }
}
