import java.util.*;
public class calculator {
    public static double addition(double value1, double value2) {
        return value1 + value2;
    }

    public static double sub(double value1, double value2) {
        return value1 - value2;
    }
    
    public static double mutiply(double value1, double value2) {
        return value1 * value2;
    }
    
    public static double divide(double value1, double value2) {
        if (value2 == 0) {
            System.out.println("cant divide by zero");
            return 0;
        }
        else {
            return value1 / value2;
        }
    }

    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------------");
        System.out.println("----------CALCULATOR---------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divition");
        System.out.println("-----------------------------");
        System.out.print("Enter the opertation(1-4)=");
        int opperation = scan.nextInt();
        System.out.println("-----------------------------");
        System.out.print("Enter value of num 1 =   ");
        double value1 = scan.nextInt();
        System.out.print("Enter value of num 1 =   ");
        double value2 = scan.nextInt();
        System.out.println("-----------------------------");
        switch (opperation) {
            case 1:
                System.out.println("the sum of two value = " + addition(value1, value2));
                System.out.println("-----------------------------");
                break;
            case 2:
                System.out.println("the sub of two value = " + sub(value1, value2));
                System.out.println("-----------------------------");
                break;
            case 3:
                System.out.println("the product of two value = " + mutiply(value1, value2));
                System.out.println("-----------------------------");
                break;
            case 4:
                System.out.println("the divide of two value = " + divide(value1, value2));
                System.out.println("-----------------------------");
                break;
            default:
                System.out.println("Invalid choice");
                System.out.println("----------------------------");
        }
        scan.close();
    }
}
