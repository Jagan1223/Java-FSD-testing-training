package Stack;

import java.util.Stack;  
public class StackSearchMethodExample  
{  
public static void main(String[] args)   
{  
Stack<String> stk= new Stack<>();  
//pushing elements into Stack  
stk.push("Mac Book");  
stk.push("HP");  
stk.push("DELL");  
stk.push("Asus"); //top=1 
System.out.println("Stack: " + stk);  
// Search an element  
int location = stk.search("HP");
if(location>0)
{
System.out.println("Location of HP: " + location);  	
}
else
{
	System.out.println("element is not found");  
}
 
}  
}  