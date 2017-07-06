import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		//12:10:00PM
		StringBuilder sb = new StringBuilder(time);
		sb.delete(8, 10); 
		String[] str = sb.toString().split(":");

		int hr = Integer.valueOf(str[0]);
		if(time.charAt(8) == 'P' && time.charAt(9) == 'M') {
			if(hr == 12) {
				System.out.println(sb);
			}
			else if(hr < 12) {
				//int hr1 = Integer.valueOf(str[0]);
				System.out.println(hr+12+":"+str[1]+":"+str[2]);
			}
		}
		else {
			if(hr == 12) {
				System.out.println("00:"+str[1]+":"+str[2]);
			}
			else if(hr < 12) {
				System.out.println(sb);
			}
		}
	}

}
