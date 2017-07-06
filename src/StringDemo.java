
public class StringDemo {
	public static void main(String[] args) {
		/*int num = 121;
		int num1 = 0;
		
		while(num != 0) {
			int rem = num % 10;            //1   2   1
			num1 = num1 * 10 + rem;			//121
			num = num/10;					//12    1
		}
		
		System.out.println(num1);*/
		
		for(int i=-1; i<10; i++) {
			if(i<5){
				System.out.println(i);
				continue;
			}
			else
				break;
			//System.out.println("Hack");
		}
	}
}
