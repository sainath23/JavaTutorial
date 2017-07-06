import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int temp = num;
			int sum = 0;
			
			while(num > 0) {
				int r = num%10;
				num = num/10;
				sum = sum + r*r*r;
			}
			System.out.println(sum);
	}

}
