package replceXXXXXXString;

import java.util.Scanner;

public class Main {
	public static String replaceX(String str) {
		char ch[] = str.toCharArray();
		for(int i = 0;i<ch.length-4;i++){
			ch[i] = 'X';
		}
		String newStr = String.valueOf(ch);
		return newStr;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String value: ");
		String str = sc.next();
		System.out.println(replaceX(str));
	}

}
