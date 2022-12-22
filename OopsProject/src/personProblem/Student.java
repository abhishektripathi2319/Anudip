package personProblem;

import java.util.Arrays;

public class Student extends Person {
	static final String instituteName = "UCER";
	String roll_number;
	String[] Subjects;
	public Student(String name, int age, String mob, String roll_number, String[] subjects) {
		super(name, age, mob);
		this.roll_number = roll_number;
		Subjects = subjects;
	}
	
	@Override
	public String toString() {
		return "Student [roll_number=" + roll_number  + ", Name=" + Name
				+ ", Age=" + Age + ", Mob=" + Mob + ", Subjects=" + Arrays.toString(Subjects)+ ", Institute_Name= " +instituteName + "]";
	}
	void print() {
		System.out.println(toString());
	}
	
	

}
