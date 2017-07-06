import java.util.Scanner;

public class PalindromeIndex {
	
	public static boolean checkPalindrome(String s) {
		String str2 = new StringBuilder(s).reverse().toString();
		if(str2.equals(s))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T-- > 0) {
			String str1 = sc.next();
			char[] str2 = str1.toCharArray();
			int left = 0;
			int right = str2.length-1;
			if(checkPalindrome(str1)) {
				System.out.println("-1");
			}
			else { 
				while(str2[left] == str2[right]) {
					left++;
					right--;
				}
				String temp = new StringBuilder(str1).deleteCharAt(left).toString();
				if(checkPalindrome(temp)) {
					System.out.println(left);
				}
				else {
					temp = new StringBuilder(str1).deleteCharAt(right).toString();
					if(checkPalindrome(temp)) {
						System.out.println(right);
					}
				}
			}
		}
	}
}
