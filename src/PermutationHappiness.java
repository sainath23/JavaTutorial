import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PermutationHappiness {
    static ArrayList<Integer> al = new ArrayList<Integer>();
	static void findHappy(int[] a, int k) {
		int[] arr = a;
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			int first = arr[0];
			int last = arr[arr.length-1];
			if(count != k) {
				if(arr[i] == first) {
					if(arr[i] < arr[i+1])
						count++;
					
				}
				else if(arr[i] == last) {
					if(arr[i] < arr[i-1])
						count++;
					
				}
				else {
					if(arr[i] < arr[i+1] || arr[i] < arr[i-1])
						count++;
					
				}
			}
			
		}
		al.add(count);
		//System.out.println(count);
	}
	
	static void permute(int[] arr, int start, int end, int k) {
		//int k=3;
		int count = 0;
		if(start == end) {
			//System.out.println(arr);
			findHappy(arr, k);
		}
		else {
			for(int i=start; i<=end; i++) {
				swap(arr, start, i);
				permute(arr, start+1, end, k);
				swap(arr, start, i);
			}
		}
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp;
		int[] arr1 = arr;
		temp =arr1[i];
		arr1[i] = arr1[j];
		arr1[j] = temp;
		//return String.valueOf(arr1);
	}

    static int query(int n, int k){
        // Complete this function
        int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
        permute(arr, 0, arr.length-1, k);
        int max = al.get(0);
        int count = 0;
		for(int i=1; i<al.size(); i++) {
        	if(max < al.get(i)) {
        		max = al.get(i);
        	}
        }
        for(int i=0; i<al.size(); i++) {
        	if(al.get(i) == max) {
        		max = al.get(i);
        		count++;
        	}
        }
        int result = count%(int)(Math.pow(10, 9)+7);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            // Find the number of ways to arrange 'n' people such that at least 'k' of them will be happy
            // The return value must be modulo 10^9 + 7
            int result = query(n, k);
            System.out.println(result);
        }
    }
}