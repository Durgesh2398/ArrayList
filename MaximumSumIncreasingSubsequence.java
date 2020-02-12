package arrayListQuestion;

import java.util.Scanner;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSumIncreasingSubsequence ob = new MaximumSumIncreasingSubsequence();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of inputs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(ob.output(arr,n));
	}
	int output(int arr[],int n) {
		int i, j, max = 0; 
        int msis[] = new int[n]; 
        for (i = 0; i < n; i++) 
            msis[i] = arr[i]; 
        for (i = 1; i < n; i++) { 
            for (j = 0; j < i; j++) {
                if (arr[i] > arr[j] && msis[i] < msis[j] + arr[i]) {
                    msis[i] = msis[j] + arr[i]; 
                }
            }
        }
        for (i = 0; i < n; i++) { 
            if (max < msis[i]) { 
                max = msis[i]; 
            }
        }
  
        return max;
	}

}
