import java.util.Scanner;

public class grade_calculator {
    public static int total(int grade[]) {
        int total = 0;
        for (int i = 0; i < grade.length; i++) {
            total += grade[i];
        }
        return total;
    }

    public static double average(int total, int count) {
        double average =(double) total / count;
        return average;
    }

    public static void show(int grade[]) {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < 35) {
                System.out.println("your grade on subject " + (i+1) + " = F");
            }
            else if (grade[i] >= 35 && grade[i] <= 50) {
                System.out.println("your grade on subject " + (i+1) + " = D");
            }
            else if (grade[i] >= 51 && grade[i] <= 65) {
                System.out.println("your grade on subject " + (i+1) + " = C");
            }
            else if (grade[i] >= 66 && grade[i] <= 80) {
                System.out.println("your grade on subject " + (i+1) + " = B");
            }
            else if (grade[i] >= 81 && grade[i] <= 95) {
                System.out.println("your grade on subject " + (i+1) + " = A");
            }
            else if (grade[i] >= 96 && grade[i] <= 100) {
                System.out.println("your grade on subject " + (i+1) + " = O");
            }
        }
    }

    public static void main(String[] arg) {

        Scanner scan = new Scanner(System.in);
        int opperation;
        int num_sub;
        int grade[];
     do{
        System.out.println("-----------------------------------");
        System.out.println("----------Grade CALCULATOR---------");
        System.out.println("1. total");
        System.out.println("2. average");
        System.out.println("3. display grades");
        System.out.println("4. exit");
        System.out.println("-----------------------------------");
        System.out.print("Enter the opertation(1-4)=");
        opperation = scan.nextInt();
        
        switch (opperation) {
            case 1:
                System.out.println("-----------------------------------");
                System.out.println("Enter the num of subject");
                num_sub = scan.nextInt();
                grade = new int[num_sub];
                for (int i = 0; i < num_sub; i++) {
                    System.out.print("Enter the subject " + i + " grade =");
                    grade[i] = scan.nextInt();
                }
                System.out.println("-----------------------------------");
                System.out.println("the total of your grade = "+total(grade));
                System.out.println("-----------------------------");
                break;
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("Enter the num of subject");
                num_sub = scan.nextInt();
                grade = new int[num_sub];
                for (int i = 0; i < num_sub; i++) {
                    System.out.print("Enter the subject " + i + " grade =");
                    grade[i] = scan.nextInt();
                }
                System.out.println("-----------------------------------");
                System.out.println("the average of your grade = " + average(total(grade), num_sub));
                System.out.println("-----------------------------");
                break;
            case 3:
                System.out.println("-----------------------------------");
                System.out.println("Enter the num of subject");
                num_sub = scan.nextInt();
                grade = new int[num_sub];
                for (int i = 0; i < num_sub; i++) {
                    System.out.print("Enter the subject " +(i+1)+ " grade =");
                    grade[i] = scan.nextInt();
                }
                show(grade);
                System.out.println("-----------------------------------");
                break;
            case 4:
                System.out.println("-----------------------------------");
                System.out.println("Exiting.....");
                System.out.println("-----------------------------------");
                break;
            default:
                System.out.println("Invalid choice");
                System.out.println("----------------------------------");
        }
    } while (opperation != 4);
        scan.close();
}
    
}
