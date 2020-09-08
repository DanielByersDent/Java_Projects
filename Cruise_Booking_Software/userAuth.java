package thirdProject;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class userAuth {
	
	private ArrayList<Map<String, String>> userHistory = new ArrayList() {
		  ArrayList<Map<String, String>> userHistory= new ArrayList<Map<String, String>>()
		  
		  if ( userHistory == null) { 
			  return userHistory;  
		  }
		  for (int i = 0; i < userHistory.size(); i++) {
		    Map<String, String> item = new HashMap<String, String>();
		    item.put("ItemFileName", list.get(i).get(0));
		    userHistory.add(item);
		  }
		  return userHistory;
	}
	
}
