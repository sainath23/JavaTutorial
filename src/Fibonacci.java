
public class Fibonacci {
	public static void main(String[] args) {
		/*int a = 1, b = 1, k = 0;
		//1 1 2 3 5
		System.out.print("1 1 ");
		while(k<=50) {
			k = a + b;
			System.out.print(k+" ");
			a = b;
			b = k;
		}*/
		
		
		//Tabulation DP
		int n = 10;
		int[] lookupTable = new int[n+1];
		lookupTable[0] = 0;
		lookupTable[1] = 1;
		
		for(int i=2; i<n; i++) {
			lookupTable[i] = lookupTable[i-1] + lookupTable[i-2];
		}
		for(int i=0; i<n; i++)
			System.out.println(lookupTable[i]);
	}
}
