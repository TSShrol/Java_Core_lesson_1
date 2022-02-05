package java_core_lesson3_2;

public class Circle {
	private double radius;
	private double diametr;
	
	Circle(){
		this.radius=12.5;
		this.diametr=2*this.radius;
	}
	Circle(double radius){
		this.radius=radius;
		this.diametr=2*this.radius;
	}
	public double sqaure() {
		System.out.println(diametr);
		return Math.round((1/4.0)*(diametr*diametr)*Math.PI);
	} 
	public double lenght() {
		return Math.round((2*radius*Math.PI));
	}
}
