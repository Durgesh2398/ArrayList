package arrayListQuestion;
import java.util.*;
public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		TrappingRainWater ob=new TrappingRainWater();
		ob.output(arr,n);
	}
	static void output(int arr[],int n) {
		int result = 0; 
        int left_max = 0, right_max = 0; 
        int lo = 0, hi = n - 1; 
        while (lo <= hi) { 
            if (arr[lo] < arr[hi]) { 
                if (arr[lo] > left_max) {
                	left_max = arr[lo]; 
                }
                else {
                	result += left_max - arr[lo];
                }
                lo++; 
            } 
            else { 
                if (arr[hi] > right_max) { 
                	right_max = arr[hi]; 
                }
                else {
                    result += right_max - arr[hi];
                }
                hi--; 
            } 
        } 
        System.out.println(result);
	}

}
