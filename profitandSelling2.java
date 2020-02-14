//Maximum profit by buying and selling a share at most twice
package arrayListQuestion;

import java.util.Scanner;

public class profitandSelling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		profitandSelling2 ob = new profitandSelling2();
		System.out.println(ob.output(arr,n));
	}
	static int output(int price[],int n) {
		int profit[] = new int[n]; 
        for (int i=0; i<n; i++) { 
            profit[i] = 0;
        }
        int max_price = price[n-1]; 
        for (int i=n-2;i>=0;i--) { 
            if (price[i] > max_price) { 
                max_price = price[i]; 
            }
          profit[i] = Math.max(profit[i+1], max_price-price[i]); 
        }
        int min_price = price[0]; 
        for (int i=1; i<n; i++) { 
            if (price[i] < min_price) { 
                min_price = price[i]; 
            }
       
            profit[i] = Math.max(profit[i-1], profit[i] + (price[i]-min_price) ); 
        } 
        int result = profit[n-1];
		return result;
	}

}
