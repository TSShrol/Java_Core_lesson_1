package java_core_lesson3_1;

public class Rectangle {
/*1. �������� ���� Rectangle , � ����� ���� ������� ����:
 *  �������, ������. �������� ����������� � ����������� �
 *   ��� ���������. � ����������� ��� ��������� ������� ��� ���.
 *   ����� ��������� �ᒺ��, �� ������ ������ ������������, �� ��������
 *   ����������� ������ ������. �������� ������, �� ������ ������������� 
 *   ����� �� ��������. � Main ���� ���������������� ��������� �ᒺ��� 
 *   �������������� ��� ������������. ������� �� ������� ����� � ��������
 *    ������������. ���� �� ������ ������� ���� ��������� ������: ������ 
 *    ������������ = ��� ���� �����, ��������� ������������ = ��� ���� �������� .*/
	
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

