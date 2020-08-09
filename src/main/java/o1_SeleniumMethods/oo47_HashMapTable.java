package o1_SeleniumMethods;
	
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class oo47_HashMapTable {

	public static void main(String[] args) {
		
		//Hashmap :
		//HashMap<String, String> userMap = new HashMap<String, String>();
		Map<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("id", "1");
		userMap.put("name", "John");
		userMap.put("city", "Istanbul");
		userMap.put(null, "ilhan"); // x
		userMap.put("Furkan", null);
		userMap.put(null, null);
		
		System.out.println(userMap.get("name"));
		//System.out.println(userMap.get(0)); //null
		System.out.println(userMap.size());
		
		for(Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		//Hashmap is non synchorinzed -- not thread safe
		
		
		
		//Hastable :
		Hashtable<String, Integer> prodcutTable = new Hashtable<String, Integer>();
		prodcutTable.put("Apple Macbook", 2000);
		prodcutTable.put("Windows MSI Laptop", 1000);
		prodcutTable.put("Apple iPhoneX", 1500);
		//prodcutTable.put(null, "ilhan"); //no null key and no null values in hashtable
		
		System.out.println(prodcutTable);
		System.out.println(prodcutTable.get("Apple Macbook"));
		
		for(Map.Entry m : prodcutTable.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
		
		//Hastable is synchorinzed -- thread safe
		
	
	}

}
