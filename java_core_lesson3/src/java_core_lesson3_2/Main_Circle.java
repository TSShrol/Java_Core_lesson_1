package java_core_lesson3_2;

public class Main_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle();
		System.out.println("Площа кола = "+circle1.sqaure());
	    System.out.println("Довжина кола = "+circle1.lenght());
	    Circle circle2=new Circle(4.5);
		System.out.println("Площа кола = "+circle2.sqaure());
	    System.out.println("Довжина кола = "+circle2.lenght());
	    System.out.println(circle2);
	}

}
