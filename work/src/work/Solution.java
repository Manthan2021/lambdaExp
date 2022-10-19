package work;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
	 static boolean ispar(String x)
	    {
	     
	        Stack<Character> stack=new Stack<>();
	        HashMap<Character,Character> map=new HashMap<>(){ 
	            {
	            put('(',')');
	            put('{','}');
	            put('[',']');
	        }
	    };
	    char[] array=x.toCharArray();
	    for(char element:array){
	        if(element=='(' || element=='{' || element=='['){
	            stack.push(element);
	        }
	        else if(element==')'|| element=='}'|| element==']'){
	            if(stack.isEmpty()==true){
	                return false;
	            }
	            if(map.get(stack.peek())==element){
	                stack.pop();
	            }
	            else{
	                return false;
	            }
	        }
	    }
	        
	        if(stack.isEmpty()){
	            return true;
	        }
	        return false;
	    }
	           
	          // add your code here
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean val=ispar("){}[]");
    System.out.println(val);
	}

}
