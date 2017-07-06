
public class MyCalculator extends Calculation {
	static int c;
	public void multiplication(int x, int y) {
		int z = x*y;
		System.out.println("Multiplication = "+z);
	}
	
	public static void main(String[] args) {
		int a = 10, b = 2;
		MyCalculator myCal = new MyCalculator();
		myCal.multiplication(a, b);
		myCal.addition(a, b);
		myCal.subtraction(a, b);
		System.out.println("C "+c);
	}
}
