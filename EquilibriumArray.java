package arrayListQuestion;

import java.util.Scanner;

public class EquilibriumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EquilibriumArray ob = new EquilibriumArray();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of inputs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(ob.equilibriumArray(arr,n));
	}
	int equilibriumArray(int arr[],int n) {
		int sum = 0;
        int leftsum = 0; 
        for (int i = 0; i < n; ++i) {
            sum += arr[i]; 
        }
        for (int i = 0; i < n; ++i) { 
            sum -= arr[i]; 
            if (leftsum == sum) {
                return i; 
            }
            leftsum += arr[i]; 
        } 
        return -1;
	}

}
