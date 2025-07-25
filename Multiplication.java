package Basics_of_java; //method with parameter and return type

public class Multiplication {
	int multi(int x, int y) {
		x=30;
		y=40;
		int multi= x*y;
		System.out.println(multi);
		return multi;
	}

	public static void main(String[] args) {
		Multiplication multi= new Multiplication();
		multi.multi(30, 40); // reference name + met
		System.out.println("Shubham bokachoda");
		

	}

}
