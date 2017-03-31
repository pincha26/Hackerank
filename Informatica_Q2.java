
public class Informatica_Q2 {
	
	public static void main(String args[]){
		
		int [] input = {0,1,2,3,4,5,6,7,8,9,10};
		String result= plusMult(input);
		System.out.println(result);
	}

    static String plusMult(int[] A) {
		
    	int ans1 = A[0];
    	for(int i=2;i<A.length-2;i=i+4 ){
    		
    		ans1 = ans1* A[i];
    		ans1 = ans1 + A[i+2];
    	}
    	ans1 = ans1%2;
    	int ans2 = A[1];
    	for(int i=3;i<A.length-2;i=i+4 ){
    		
    		ans2 = ans2* A[i];
    		ans2 = ans2 + A[i+2];
    	}
    	ans2 = ans2%2;
    	
    	if(ans1<ans2){
    		
    		return "ODD";
    	}
    	else if(ans2<ans1){
    		
    		return "EVEN";
    	}
    	else if(ans2==ans1){
    		
    		return "NEUTRAL";
    	}
    	return null;
    }
}
