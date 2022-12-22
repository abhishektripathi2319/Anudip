package BankProblem;

public class mainClass {
	public static void main(String args[]) {
	BankA a = new BankA();
	System.out.println("Deposited amount in BankA = "+a.getBalance(1000));
	BankB b = new BankB();
	System.out.println("Deposited amount in BankB = "+b.getBalance(1500));
	BankC c = new BankC();
	System.out.println("Deposited amount in BankC = "+c.getBalance(2000));
}
}