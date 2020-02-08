package arrayListQuestion;

import java.util.Scanner;

public class RotateMatrix90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter square matrix size");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int arr[][]=new int [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("before");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		for (int x = 0; x < n / 2; x++) { 
			for (int y = x; y < n-x-1; y++) {
				int temp = arr[x][y]; 
				arr[x][y] = arr[y][n-1-x]; 
				arr[y][n-1-x] = arr[n-1-x][n-1-y]; 
				arr[n-1-x][n-1-y] = arr[n-1-y][x]; 
				arr[n-1-y][x] = temp; 
			} 
		}
		System.out.println("output");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
