package arrayListQuestion;

import java.util.Scanner;

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockBuySell ob = new StockBuySell();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(ob.output(arr,0,n-1));
	}
	public static int output(int arr[],int s,int e) {
		if(s>=e) {
			return 0;
		}
		int profit=0;
		for(int i=s;i<e;i++) {
			for(int j=i+1;j<=e;j++) {
				if(arr[j]>arr[i]) {
					int cur=arr[j]-arr[i]+output(arr,s,i-1)+output(arr,j+1,e);
					profit=Math.max(profit, cur);
				}
			}
		}
		return profit;
	}

}
