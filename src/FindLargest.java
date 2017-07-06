
public class FindLargest {
	public static void main(String[] args) {
		int[] arr = {102, 20, 30, 680, 70, 100, 200, 7000};
		
		int largestNum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > largestNum) {
				largestNum = arr[i];
			}
		}
		System.out.println(largestNum);
	}
}
