import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InterofficeTravel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Each index 'i' contains the energy necessary to travel 'i' units.
        int[] w = new int[n];
        for(int w_i=0; w_i < n; w_i++){
            w[w_i] = in.nextInt();
        }
        int[][] layout = new int[n][n];
        for(int a0 = 0; a0 < n-1; a0++){
            // A hallway connects offices 'u' and 'v'
            int u = in.nextInt();
            int v = in.nextInt();
            // Write Your Code Here
            layout[u-1][v-1] = 1;
            layout[v-1][u-1] = 1;
        }
        
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        		if(layout[i][j] == 0) {
        			int k = 0;
        			while(layout[i][k] != 1) {
        				k++;
        			}
        			if(layout[k][j] >= 1) {
        				layout[i][j] = layout[i][k]+layout[k][j];
        			}
        		}
        		layout[i][i] = 0;
        	}
        }
        int[] sum = new int[n];
        for(int i=0; i<n; i++) {
        	for(int j=0; j<n; j++) {
        			sum[i] = 0 + sum[i] + w[layout[i][j]];
        	}
        }
        for(int i=0; i<n; i++) {
        	System.out.print(sum[i]+" ");
        }
        
    }
}