import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Weighted_Uniform_string {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String s = sc .nextLine();
		int n = sc.nextInt();
		long a[] =new long[n];
		
		char c[] = s.toCharArray();
		ArrayList<Long> result = new ArrayList<Long>();
		result.add((long) (c[0]-96));	
		
		for(int i=1;i<c.length;i++){
			result.add((long) (c[i]-96));	
			if(c[i]==c[i-1]){
				result.set(i, result.get(i)+result.get(i-1));
			}
		}

		for(int i = 0;i<n;i++){
			a[i] = sc.nextLong();
			if(result.contains(a[i])){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		
		
	}
	
	
}
