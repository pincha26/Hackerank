import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Informatica_Q1 {

	public static void main(String args[]){
		
		String input = "(B,D) (D,E) (A,B) (C,F) (E,G) (A,B)";
		
			String result  = SExpression(input);
			System.out.println(result);
	}
	
    static String SExpression(String nodes) {
    	
    	
    	char a[] = nodes.toCharArray();
    	HashMap<Character, ArrayList<Character>> map = new HashMap<Character,ArrayList<Character>>();
    	
    	String output ="";
    	
    	for(int i=0;i<a.length-3;i++){
    		
    		if(a[i]== '('){
    			
    			
    			if(map.containsKey(a[i+1])){
    				ArrayList<Character> c = new ArrayList<Character>();
    				c = map.get(a[i+1]);
    				
    				if(c.get(0)== a[i+3]){
    					output= "E2";
    					break;
    				}
    				
    				c.add(a[i+3]);
    				
    				if(c.size()>3){
    					output = "E1";
    					break;
    				}
    				map.put(a[i+1], c);
    			}
    			else{
    				ArrayList<Character> c = new ArrayList<Character>();
    				c.add(a[i+3]);
    				map.put(a[i+1],c );
    			}
    			
    		}
    	
    	}
    	
    	
    	class node {
    		
    		node left;
    		node right;
    		char data;
    		node(char d){
    			
    			this.left= null;
    			this.right= null;
    			this.data =d;
    		}
    	}
    	
    	
    	node root =null;
    	
    		for (Character key : map.keySet()) {
    			ArrayList<Character> c = new ArrayList<Character>();
    			c=	map.get(key);
    			if(root == null){
    				
    				root = new node(key);
    				
    				if(c.size() ==2){
    					root.left = new node(c.get(0));
    					root.right = new node(c.get(1));
    				}
    				else{
    					root.left = new node(c.get(0));
    				}
    			}
    			
    			
    			
    		}
    
    
    	
    	
    	
    	
    	
    	
    	if(output=="E2"){
    		return "E2";
    	}
    	else if(output=="E1")
    		return "E1";
    	
		return nodes;


    }
	
}
