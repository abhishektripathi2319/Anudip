package LabTest1;

public class GreatestNum {
    public static void FindGreatestNumber(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("Greatest Number is : " + a);
            } else {
                System.out.println("Greatest Number is : " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest Number is : " + b);
            } else {
                System.out.println("Greatest Number is : " + c);
            }
        }
    }

    public static void main(String[] args) {
        FindGreatestNumber(50, 100, 90);

    }
}
