package arrayListQuestion;

import java.util.Scanner;

public class SamllestSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamllestSubarraySum ob= new SamllestSubarraySum();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of inputs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the sum to find");
		int sum=sc.nextInt();
		ob.smallestsubarraysum(arr,n,sum);
		
	}
	void smallestsubarraysum(int arr[],int n,int sum) {
		int csum=0;
		int minlength=n+1;
		int i=0,j=0;
		while(j<n) {
			while(csum<=sum&&j<n) {
				csum=csum+arr[j++];
			}
			while(csum>sum&&i<n) {
				if(j-1<minlength) {
					minlength=j-i;
				}
				csum=csum-arr[i++];
			}
		}
		System.out.println(minlength);
	}

}
