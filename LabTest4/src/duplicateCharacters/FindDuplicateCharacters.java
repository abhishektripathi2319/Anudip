package duplicateCharacters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateCharacters{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		System.out.println("Duplicates are : "+ findDuplicates(str));		
	}
	
	public static ArrayList<Character> findDuplicates(String str) {
			HashSet<Character> set = new HashSet<>();
			ArrayList<Character> charList = new ArrayList<>();
			
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				set.add(ch);
				charList.add(ch);
			}
			
			ArrayList<Character> charList1 = new ArrayList<>();
			for(Character c: set) {
				if(Collections.frequency(charList, c)>1) {
					charList1.add(c);
				}
			}
			
			return charList1;		
		}
}
