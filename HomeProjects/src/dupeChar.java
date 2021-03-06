import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


/*
 We use HashMap and Set to find the duplicate characters in a string.
  First, we convert the given string to char array. We then create one HashMap with Character as a key and 
  it�s number of occurrences as a value. Then we extract a Set containing all keys of this HashMap using
   keySet() method. Then we use this keySet to get the duplicate characters i.e characters which have appeared
    more than once in the given string.
 */

// USING A HASMAP, WE NEED A KEY AND A VALUE. SO WE USE THE CHAR AS THE KEY, AND THE OCCURENCES
// OF THAT CHAR AS  THE VALUE. WE  START EVERY CHAR AT VALUE 1 , THEN IF ITS ON THE COUNT MAP WE
// INCREMENT THE VALUE.
public class dupeChar {

	public static void main(String[] args) {
		//WE USED A HASH MAP
		// get the dupes of single chars of a single string
		 String array = "tryuiotry";
	     HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

	        
	        char[] strArray = array.toCharArray();//convert the string into a char aray so
	         // we can look at each char to find dupes
	        for (char c : strArray)  //checking each char of strArray
	        {
	        	
	        	if(charCountMap.containsKey(c))
				{
					//If char is present in charCountMap, incrementing it's count by 1
	        		// if that char is already in the countmap , increment that count by 1 (+1)

					charCountMap.put(c, charCountMap.get(c)+1);
				}
				else
				{
					//If char is not present in charCountMap,
					//putting this char to charCountMap with 1 as it's value
					// if the char is not on the countmap ( ie. first time)
					// then we ad it to the map with a value of 1.

					charCountMap.put(c, 1);
				}
			}
	        
	        //the way to print out a hashmap is by using a keyset
	        //keySet() only returns a set of key in your hashmap , 
	        //you should iterate this key set and the get the value from the hashmap using these keys

	      
	        // we convert the CountMap to a keyset and iterate threw it and print out the keys/values
	        // we are getting chars so the first part is a Char, teh 2nd part is the countmap covnersion into keyset.
	        System.out.println("Duplicate Characters In "+array);
	        for (char ch : charCountMap.keySet())
	        {
				if(charCountMap.get(ch) > 1)
				{
					//If any char has a count of more than 1, printing it's count

					System.out.println(ch +" : "+ charCountMap.get(ch));
				}
			}
	        	
	        
	        
	        
	        
	        	
	        	
	        }
	        }


