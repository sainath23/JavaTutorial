import java.util.Scanner;
public class QuickSort {
	
	public static int partition(int arr[], int start, int end) {
		int loc = arr[end];
		int i = start-1;
		for(int j=start; j<end-1; j++) {
			if(arr[j] <= loc) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = loc;
		loc = temp;
		
		return loc;
	}
	
	public static void quickSort(int arr[], int start, int end) {
		
		if(start < end) {
			int loc = partition(arr, start, end);
			partition(arr, start, loc-1);
			partition(arr, loc+1, end);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total elements in an array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter "+n+" elements: ");
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		int start = 0;
		int end = n-1;
		quickSort(array, start, end);
	}
}
