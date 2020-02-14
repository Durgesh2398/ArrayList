package arrayListQuestion;

import java.util.Scanner;

public class MinCostPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int arr[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.print(minCost(arr, 2, 2));
	}

	static int min(int x, int y, int z) { 
        if (x < y) { 
            return (x < z) ? x : z;
        }
        else {
            return (y < z) ? y : z; 
        }
    }  
    static int minCost(int cost[][], int m, int n) { 
        if (n < 0 || m < 0) {
            return Integer.MAX_VALUE;
        }
        else if (m == 0 && n == 0) { 
            return cost[m][n]; 
        }
        else {
            return cost[m][n] + min( minCost(cost, m-1, n-1), minCost(cost, m-1, n),  minCost(cost, m, n-1) ); 
        }
    }
}
