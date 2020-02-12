package arrayListQuestion;

import java.util.Scanner;

public class KPairSmallestNumber2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the array 1 size");
		int n=sc.nextInt();
		int a1[]=new int[n];
		for(int i=0;i<n;i++) {
			a1[i]=sc.nextInt();
		}
		
		System.out.println("enter the array 2 size");
		int m=sc.nextInt();
		int a2[]=new int[m];
		for(int i=0;i<m;i++) {
			a2[i]=sc.nextInt();
		}
		
		System.out.println("enter the to get number of pairs");
		int k=sc.nextInt();
		int ind[]=new int[n];
		if(k>n*m) {
			System.out.println("not possible");
		}
		else {
			while(k>0) {

				int min_sum = Integer.MAX_VALUE;
				int min=0;
				for(int i=0;i<n;i++) {
					if(ind[i]<m&&a1[i]+a2[ind[i]]<min_sum) {
						min=i;
						min_sum =a1[1]+a2[ind[i]];
					}
				}
				System.out.println(a1[min]+" "+a2[ind[min]]);
				k--;
			}
		}
	}

}
