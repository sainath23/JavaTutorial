import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CultureConference {
	
	static int getMinimumEmployees(int[][] e){
        // Complete this function
		int minEmp = 0;
		
		List<Integer>[] list =  new LinkedList[e.length];
        for(int i=0; i<e.length; i++) {
        	list[i] = new LinkedList<>();
        }
        
        list[1].add(10);
        list[1].add(20);
        list[1].add(30);
        list[1].add(40);
        
        for(List<Integer> i : list)
        	System.out.println(i);
        
        return minEmp;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // Information for employees 1 through n - 1:
        // The first value is the employee's supervisor ID
        // The second value is the employee's burnout status (0 is burned out, 1 is not)
        int[][] e = new int[n-1][2];
        for(int e_i=0; e_i < n-1; e_i++){
            for(int e_j=0; e_j < 2; e_j++){
                e[e_i][e_j] = in.nextInt();
            }
        }
        int minimumEmployees = getMinimumEmployees(e);
        System.out.println(minimumEmployees);
	}

}
