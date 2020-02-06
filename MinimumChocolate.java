package arrayListQuestion;
import java.util.*;
public class MinimumChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumChocolate ob = new MinimumChocolate();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of inputs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the number of students");
		int m=sc.nextInt();
		ob.output(arr,n,m);
	}
	static void output(int arr[],int n,int m) {
		Arrays.sort(arr); 
        int min_diff = Integer.MAX_VALUE;  
        int first = 0, last = 0; 
        for (int i = 0; i + m - 1 < n; i++) { 
            int diff = arr[i+m-1] - arr[i]; 
            if (diff < min_diff) { 
                min_diff = diff; 
                first = i; 
                last = i + m - 1; 
            } 
        } 
        System.out.println(arr[last] - arr[first]);
	}

}
