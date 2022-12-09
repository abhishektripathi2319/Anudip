package LabTest1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Substraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Press 5 for Exit");
            option = sc.nextInt();
            int a = 10;
            int b = 5;
            switch (option) {
                case 1:
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + (float) (a / b));
                    break;
                case 5:
                    System.out.println("Exit successfully ..");
                    break;

                default:
                    System.out.println("Choose correct option");
                    break;
            }
        } while (option != 5);
        {
            return;
        }
    }
}
