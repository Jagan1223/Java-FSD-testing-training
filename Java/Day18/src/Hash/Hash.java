package Hash;
import java.util.*;
public class Hash {

	public static void main(String[] args) {
		 Hashtable<String, Integer> ht = new Hashtable<>();
		  
	        // Add elements to the hashtable
	        ht.put("Merin", 10);
	        ht.put("Aleena", 30);
	        ht.put("Sam", 20);
	  
	        // Print size and content
	        System.out.println("Size of map is:- " + ht.size());
	        System.out.println(ht);
	  
	        // Check if a key is present and if
	        // present, print value
	        if (ht.containsKey("Merin")) {
	            Integer a = ht.get("Merin");
	            System.out.println("value for key"   + " \"Merin\" is:- " + a);}
	            System.out.println("Does Aleena Contains in hashtable is a Key? "+ht.containsKey("Aleena"));
	            System.out.println("Does the value '30' in hashtable is a Key? "+ht.containsKey(30));
	            System.out.println("Does the value '20' mapped by a key value? "+ht.contains(20));
	            System.out.println("Does the value 'Sam' mapped by a key value? "+ht.contains("Sam"));
	            //Enumeration
	            Enumeration enu = ht.elements();//Returns an enumeration of the values in this hashtable.            
	            System.out.println("The enumeration of values are:");	      
	            // Displaying the Enumeration
	            while (enu.hasMoreElements()) {
	                System.out.println(enu.nextElement());                
	            }
	            System.out.println("Set view of Values:  "+ht.entrySet());//Returns a Set view of the mappings contained in this map.
	            System.out.println(ht.equals("Merin"));
	            System.out.println("The value is "+ht.get("Sam"));//Returns the value to which the specified key is mapped
	            System.out.println("Is Hash table empty or not?  "+ht.isEmpty()); //Tests if this hashtable maps no keys to values. 
	            
	            Enumeration enu2 = ht.keys();     //	Returns an enumeration of the keys in this hashtable.       
	            System.out.println("The enumeration of keys are:");	     
	            // Condition holds true till there is single element
	            // remaining using hasMoreElements() method
	            while (enu2.hasMoreElements()) {     
	                // Displaying the Enumeration
	                System.out.println(enu2.nextElement());
	            }
	            System.out.println(ht.hashCode()); //Returns the hash code value for this Map as per the definition in the Map interface.
	            
	            /*If the value for the specified key is present and non-null, 
	             * attempts to compute a new mapping given the key and its current mapped value.*/
	            ht.computeIfPresent("Merin",(key, val) -> val + 100);
	            // print new mapping
	            System.out.println("HashMap after operation :\n " + ht);
	            
	            ht.computeIfAbsent("Izza", k->10+200);
	            System.out.println(ht);
	            
	            System.out.println("The cloned table look like this: "  + ht.clone());//Creates a shallow copy of this hashtable.
	            
	    }

	}


