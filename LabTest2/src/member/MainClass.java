package member;

public class MainClass {
	public static void main(String[] args) {
        Employee employee = new Employee("Abhishek", 18, "948367383", "Noida", 500000, "IT");
        Manager manager = new Manager("Abhay", 11, "892748392", "Delhi", 510000, "CSE");
        employee.printSalary();
        manager.printSalary();
        manager.print();
        employee.print();
    }
}
