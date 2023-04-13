package BasicJavaCode;

import java.util.Scanner;

public class IfElseStatements {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        for (; ; ) {
            System.out.println("What is your age? ");
            int age = sc.nextInt();

            if (age <= 5) {
                System.out.println("You are still young!");
            } else if (age <= 12) {
                System.out.println("You are now a primary school student!");
            } else if (age <= 18) {
                System.out.println("You are now a teen!");
            } else {
                System.out.println("You are now an adult!");
            }
            System.out.println("Do you want to exit the program? ");
            boolean ch = sc.nextBoolean();
            if (ch == true){
                System.exit(0);
            }
        }
    }
}
