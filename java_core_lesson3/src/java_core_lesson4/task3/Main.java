package java_core_lesson4.task3;

public class Main {

	public static void main(String[] args) {
		Animal animal=new Animal("�������",20, 7);
		System.out.println("����� ������� = "+animal.getName()+
				", ������� ������� = "+animal.getSpeed()+
				" ��/���, ³� ������� = "+animal.getAge()+" ����.");
		animal.setName("���");
		animal.setSpeed(4);
		animal.setAge(2);
		System.out.println("����� ������� = "+animal.getName()+
				", ������� ������� = "+animal.getSpeed()+
				" ��/���, ³� ������� = "+animal.getAge()+" ����.");
		

	}

}
