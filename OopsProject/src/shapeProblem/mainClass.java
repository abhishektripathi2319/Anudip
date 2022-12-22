package shapeProblem;

public class mainClass {

	public static void main(String[] args) {
		Rectangle rectangle  = new Rectangle(10.5,25.1);
		double area1 = rectangle.area();
		System.out.println("Area of Rectangle :  "+area1);
		Square sq = new Square(11.5);
		double area2= sq.area();
		System.out.println("Area of Square :  "+ area2);
	}

}
