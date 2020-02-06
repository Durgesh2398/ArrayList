package arrayListQuestion;

import java.util.Scanner;

public class PairDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		PairDifference ob = new PairDifference();
		System.out.println("enter the number of inputs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the number to find difference");
		int m=sc.nextInt();
		ob.output(arr,m);
	}
	static void output(int arr[],int m) {
		int n=arr.length;;
		int i=0,j=1;
		while (i <n && j < n) { 
            if (i!= j && arr[j]-arr[i] == m) { 
                System.out.print("Pair Found: "+ "( "+arr[i]+", "+ arr[j]+" )"); 
                break;
            } 
            else if (arr[j] - arr[i] < n) {
                j++; 
            }
            else {
                i++;
            }
        } 
        System.out.print("No such pair"); 
	}

}
