import java.util.Scanner;


public class Week_of_code_28 {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int c =sc.nextInt();
		int m =sc.nextInt();
		
		int[] array = new int[n];
		String ans = "";
		int max = c*m;
		
		for(int i=0;i<n;i++){
			
			array[i] = sc.nextInt();
			if(max< array[i] ){
				ans = "No";
			}
		}
		
		if(ans.equals("No")){
			
			System.out.println("No");
		}
		else{
			
			System.out.println("Yes");
		}
		
		
		
	}
}
