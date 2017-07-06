
public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello, My self Sainath Parkar";
		
		String[] strArray = str.split(" ");
		
		for(int i=strArray.length-1; i>=0; i--) {
			System.out.print(strArray[i]+ " ");
		}
	}
}
