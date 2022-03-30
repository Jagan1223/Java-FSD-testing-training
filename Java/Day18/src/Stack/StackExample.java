package Stack;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
public class StackExample {

	public static void main(String[] args) {
		Stack<String> stk= new Stack<>(); 
		// pushing elements into Stack  
		stk.push("Apple");  
		stk.push("Grapes");  
		stk.push("Mango");  
		stk.push("Orange");  
		System.out.println("Stack: " + stk);  
		// Access element from the top of the stack  
		String fruits = stk.peek();  
		//prints stack  
		System.out.println("Element at top: " + fruits);  //returns element in the top
		System.out.println("The first element is "+stk.firstElement());//returns the first element
		System.out.println("Contains 'Mango' in table? "+stk.contains("Mango"));//returns boolean value if the element is present or not
		stk.set(1, "Strawberry");//set the value
		System.out.println("Element in 1st index is : "+stk.get(1));//returns the value 
		System.out.println("Capacity = "+stk.capacity());
		stk.insertElementAt("Peach", 3); //insert an element at index 3
		System.out.println(stk);
		
		
		}

}
