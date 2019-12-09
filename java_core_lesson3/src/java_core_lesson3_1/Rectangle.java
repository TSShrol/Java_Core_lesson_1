package java_core_lesson3_1;

public class Rectangle {
/*1. Написати клас Rectangle , в якому буде описано поля:
 *  довжина, ширина. Створити конструктор з параметрами і
 *   без параметрів. В конструкторі без параметрів описати свої дані.
 *   Тобто створюючи об’єкт, за вибору даного конструктору, ви отримаєте
 *   прямокутник даного розміру. Написати методи, які будуть розраховувати 
 *   площу та периметр. В Main класі продемонструвати створення об’єктів 
 *   використовуючи два конструктори. Вивести на консоль площу і периметр
 *    прямокутника. Вивід на консолі повинен мати наступний вигляд: «Площа 
 *    прямокутника = тут буде площа», «Периметр прямокутника = тут буде периметр» .*/
	
	private double wight;
	private double hight;
	
	Rectangle(){
		this.wight=12.5;
		this.hight=12.7;
	}
	Rectangle(double wight, double hight){
		this.wight=wight;
		this.hight=hight;
	}
	public double sqaure() {
		return Math.round(this.hight*this.wight);
	} 
	public double perymetr() {
		return Math.round(2*(this.wight+this.hight));
	}
	
}

