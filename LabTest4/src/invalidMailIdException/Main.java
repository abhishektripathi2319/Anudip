package invalidMailIdException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Info info = new Info();
		boolean flag = true;
		while (flag) {
			System.out.print("Enter your Email: ");
			String email = sc.next();
			try {
				info.setEmail(email);
				flag = false;
			} catch (InvalidMailIdException msg) {
				System.out.println(msg.getMessage());

			}
		}
		System.out.println("Your email '" + info.getEmail() + "' is Valid.");

	}

}
