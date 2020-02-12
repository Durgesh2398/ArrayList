package arrayListQuestion;
import java.util.*;
public class MinimumPlatform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumPlatform ob = new MinimumPlatform();
		Scanner sc =new Scanner (System.in);
		int n= sc.nextInt();
		int arr[]=new int[n];
		int dep[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			dep[i]=sc.nextInt();
		}
		ob.output(arr,dep,n);
	}
	static void output(int arr[],int dep[],int n) {
		   Arrays.sort(arr); 
		   Arrays.sort(dep); 
		   int plat_needed = 1, result = 1; 
		   int i = 1, j = 0; 
		   while (i < n && j < n) { 
		      if (arr[i] <= dep[j]) { 
		          plat_needed++; 
		          i++; 
		       if (plat_needed > result)  
		              result = plat_needed; 
		      } 
		      else{ 
		          plat_needed--; 
		          j++; 
		      } 
		   }
		   System.out.println(result);
	}
}
