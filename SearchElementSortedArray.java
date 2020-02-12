package arrayListQuestion;

import java.util.Scanner;

public class SearchElementSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElementSortedArray ob = new SearchElementSortedArray();
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		System.out.print(ob.output(arr,0,n,k));
	}
	static int output(int arr[],int s,int e,int k) {
		if(s>e) {
			return -1;
		}
		int mid=(s+e)/2;
		if(arr[mid]==k) {
			return mid;
		}
		if(arr[s]<=arr[mid]) {
			if(k>=arr[s]&&k<=arr[mid]) {
				return output(arr,s,mid-1,k);
			}
			return output(arr,mid+1,e,k);
		}
		if(k>=arr[mid]&&k<=arr[e]) {
			return output(arr,mid+1,e,k);
		}
		return output(arr,s,mid-1,k);
	}
}
