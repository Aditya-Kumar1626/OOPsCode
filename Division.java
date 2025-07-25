package Basics_of_java; // Without parameters and with return type.

public class Division {
	double div() {
		int a=45;
		int b=50;
		double divi= (double)a/b;
		System.out.println(divi);
		return divi;
	}

	public static void main(String[] args) {
		Division div= new Division();
		div.div();
		
		

	}

}
