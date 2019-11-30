package ua.home;

public class Application {
	public static void main(String[] args) {
		//Завдання 1.	
		byte a1=3;
		short a2=4;
		int a3 =5;
		long a4= 34L;
		double b1=2.3;
		float b2=3.4F;
		boolean c=true;
		char d='j';		
		System.out.println(a1+", "+a2+", "+a3+", "+a4+", "+b1+", "+b2+", "+c+", "+d);

		//Завдання 2
		System.out.println("Byte: min="+Byte.MIN_VALUE+", max="+Byte.MAX_VALUE);
		System.out.println("Short: min="+Short.MIN_VALUE+", max="+Short.MAX_VALUE);
		System.out.println("Integer: min="+Integer.MIN_VALUE+", max="+Integer.MAX_VALUE);
		System.out.println("Long: min="+Long.MIN_VALUE+", max="+Long.MAX_VALUE);
		System.out.println("Float: min="+Float.MIN_VALUE+", max="+Float.MAX_VALUE);
		System.out.println("Double: min="+Double.MIN_VALUE+", max="+Double.MAX_VALUE);
		
		//Завдання 2	
		int []mas= {3,-4,6,-45,3,8,2,9,34,23};
		for(int i=0;i<mas.length;i++){
			System.out.print(mas[i]+" ");
		}
		int max=mas[0];
		int min=mas[0];
		for(int i=1;i<mas.length;i++){
			if (mas[i]>max) max=mas[i];
			if (mas[i]<min) min=mas[i];
		}
		System.out.print("\n min="+min+" min="+max);
		//first comment
	}
	
}
