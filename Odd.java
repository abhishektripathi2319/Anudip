package LabTest1;


public class Odd{
    public static void isOdd(int n){
        if(n%2!=0){
            System.out.print(n+" ");
        }
    } 
    public static void main(String[] args) {
        for (int i = 1; i <=20; i++) {
            isOdd(i);
        }
    }
}