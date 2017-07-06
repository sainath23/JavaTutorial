
public class Factorial {
	public static int fact(int k) {				//5 4 
		if(k == 1)								//
			return 1;							//
		else									//
			return(k * fact(k-1));				//5x4x3
	}
	
	public static void main(String[] args) {
		System.out.println("Factorial of 5 "+fact(5));
	}
}
