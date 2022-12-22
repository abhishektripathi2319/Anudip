package personProblem;

public class mainClass {

	public static void main(String[] args) {
		String[] sub1 = {"Physics","Chemistry"};
		String[] sub2 = {"Operating System","Networking"};
		Student s1  = new Student("Abhishek",20,"823472829","203837",sub1);
		Student s2  = new Student("Ajay",21,"892394343","204348",sub2);
		s1.print();
		s2.print();

	}

}
