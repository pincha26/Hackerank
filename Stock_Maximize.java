import java.util.ArrayList;
import java.util.Scanner;


public class Stock_Maximize {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			
			int length = sc.nextInt();
			ArrayList<Integer> stockCount = new ArrayList<Integer>();
			for(int j=0;j<length;j++){
				
				stockCount.add(sc.nextInt());
			}
			int maxSofar=0;
			long totalProfit =0;
			
			for(int j=stockCount.size()-1;j>-1;j--){
				
				if(stockCount.get(j)>maxSofar){
					maxSofar = stockCount.get(j);	
				}
					totalProfit= totalProfit+ maxSofar - stockCount.get(j);
			}
			
			System.out.println(totalProfit);
		}
	}
}
