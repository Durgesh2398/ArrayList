//to find the indexes between the array  of given sum
package arrayListQuestion;
import java.util.*;
public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArraySum ob= new SubArraySum();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of inputs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the sum to find");
		int sum=sc.nextInt();
		ob.subarraysum(arr,n,sum);
	}
	int subarraysum(int arr[],int n,int sum) {
		int csum=0;
		for(int i=0;i<n;i++) {
			csum=arr[i];
			for(int j=i+1;j<=n;j++) {
				if(csum==sum) {
					int p=j-1;
					System.out.println(i+"between"+p);
					return 1;
				}
				if(csum>sum||j==n) {
					break;
				}
				csum=csum+arr[j];
			}
		}
		System.out.println("not found");
		return 0;
	}

}
