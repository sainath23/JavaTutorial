import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static ArrayList<Long> al = new ArrayList<Long>();
	static long findAndValue(long[] andArr) {
		long value = andArr[0];
		for(int i=1; i<andArr.length; i++) {
			value = value & andArr[i];
		}
		return value;
	}
    
	static void combination(long[] a, long arr[], int start, int end, 
							int index, int k) {
		long[] andArr = new long[k];
		
		if(index == k) {
			for(int i=0; i<k; i++) {
				andArr[i] = arr[i];
			}
			
			al.add(findAndValue(andArr));
			return;
		}
		
		for(int i=start; i<=end && end-i+1>=k-index; i++) {
			arr[index] = a[i];
			combination(a, arr, i+1, end, index+1, k);
		}
	}

    static long[] solve(int n, int k, long[] a){
        // Complete this function
        long[] arr = new long[k];
        combination(a, arr, 0, n-1, 0, k);
        long[] result = new long[2];
        int count = 0;
        long max = al.get(0);
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
        long maxMod = count%(long)(Math.pow(10, 9)+7);
        result[0] = max;
        result[1] = maxMod;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = new long[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextLong();
        }
        //solve(n, k, a);
        long[] result = solve(n, k, a);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != n - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
