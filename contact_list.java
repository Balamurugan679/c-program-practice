import java.util.ArrayList;
import java.util.Scanner;
public class contact_list {
    public static void main(String[] args) {
        ArrayList<String> contact = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----------------------------");
            System.out.println("----------CALCULATOR---------");
            System.out.println("1. Add contact ");
            System.out.println("2. View contacts");
            System.out.println("3. Search contact ");
            System.out.println("4. exit");
            System.out.println("-----------------------------");
            System.out.print("Enter the choice(1-4)=");
            choice = scan.nextInt();
            scan.nextLine();
            System.out.println("-----------------------------");
            switch (choice) {
                case 1:
                    System.out.print("Enter the contact : ");
                    String name = scan.nextLine();
                    contact.add(name);
                    System.out.println("contact saved !!!");
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    for (int i = 0; i < contact.size(); i++) {
                        System.out.println((i + 1) + " ." + contact.get(i));
                    }
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("enter the name to find :");
                    String search_name = scan.nextLine();
                    if (contact.contains(search_name)) {
                        System.out.println("contact found !!!");
                    } else {
                        System.out.println("contact not found xxx");
                    }
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("Exiting.....");
                    System.out.println("-----------------------------------");
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.out.println("----------------------------");
            }

        } while (choice != 4);
        scan.close();
    }
  
}
