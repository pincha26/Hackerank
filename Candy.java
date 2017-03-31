import java.util.Scanner;


public class Candy {

	public static void main(String args[]){
		
		
		Scanner sc =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		for(int i=0;i<n;i++){
			
			array[i] = sc.nextInt();
		
		}
		int[] ans = new int[n];
		
		for(int i=0;i<n;i++){
			ans[i] = 1;
		}
		
		for(int i=1;i<n;i++){
		
			if(array[i-1]< array[i]){
				ans[i]= ans[i-1]+ 1;
				
			}
		}
		
		for(int i=n-2;i>=0;i--){
			
			if(array[i]> array[i+1]){
				
				if(ans[i]<=ans[i+1]){
					ans[i] = ans[i+1]+1;
				}
			}	
		}
		
		long total = 0;
		
		for(int i=0;i<n;i++){
			total =total +ans[i];
		}
		System.out.println(total);
	}
}
