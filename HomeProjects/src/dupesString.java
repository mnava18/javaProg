import java.util.HashMap;

public class dupesString {
// dupes in strings using HASHMAP
	
	public static void main(String[] args) {
		  String[] strArray = {"mike","abc", "def", "mno", "xyz", "pqr", "xyz", "mike","def","tre","ret","tre","tree","uio","mike","mno"};
		  HashMap<String, Integer> stringCountMap = new HashMap<String, Integer>();
		  
		    for (String c : strArray)  //checking each char of strArray
	        {
	        	
	        	if(stringCountMap.containsKey(c))
				{
					//If char is present in charCountMap, incrementing it's count by 1
	        		// if that char is already in the countmap , increment that count by 1 (+1)

					stringCountMap.put(c, stringCountMap.get(c)+1);
				}
				else
				{
					//If char is not present in charCountMap,
					//putting this char to charCountMap with 1 as it's value
					// if the char is not on the countmap ( ie. first time)
					// then we ad it to the map with a value of 1.

					stringCountMap.put(c, 1);
				}
			}
		   // System.out.println("Duplicate Characters In "+strArray);
	        for (String st : stringCountMap.keySet())
	        {
				if(stringCountMap.get(st) > 1)
				{
					//If any char has a count of more than 1, printing it's count
				
					System.out.println(st+" Is a Dupe" + " and shows up "+stringCountMap.get(st)+" times");
				}
				if(stringCountMap.get(st) <= 1)
				{
					//If any char has a count of more than 1, printing it's count
				
					System.out.println(st+" Is not a Dupe" + " and shows up only "+stringCountMap.get(st)+" time");
				}
			}
		  
		  
	}

}
