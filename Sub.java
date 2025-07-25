package Basics_of_java; //with parameter and without return type

public class Sub {
	void subtract(int x, int y) { // method with argument and no return type
		x=68;
		y=89;
		int value=  x-y;
		System.out.println(value);
		
	}

	public static void main(String[] args) {
		Sub subtract = new Sub(); // { Creating object of Sub class using ClassName referenceName = new ClassName() }
		subtract.subtract(68, 89); // Reference Variable name + method name;
	}

}
