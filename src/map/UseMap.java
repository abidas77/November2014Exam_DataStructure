package map;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UseMap {
	Map<String, String> mapData = new HashMap<String, String>();

	// Implement a method which can add data into a Map
	public void addElementByMap(String data, String value) {

		mapData.put(data, value);
	}

	/*
	 * Implement a method that can retrieve data from a Map and it will return
	 * data containing in a Map Use while loop to iterate through
	 */

	public String[] getDataByMap() {
		List<String> list = new ArrayList<String>();
		Set<Map.Entry<String, String>> mapEntry = mapData.entrySet();
		for (Map.Entry<String, String> me : mapEntry) {
			list.add(me.getValue());
		}
		String[] strArray = new String[list.size()];
		return list.toArray(strArray);
	}

	/*
	 * Implement a method that can retrieve data from a Map contains List and it
	 * will return data containing in a Map Use for loop to iterate through
	 */

	public List<String[]> getDataByMapList(Map<String, List<String>> listData) {
		List<String[]> listOfStringArrays = new ArrayList<String[]>();
		for (Map.Entry<String, List<String>> mapEntry : listData.entrySet()) {
			String[] arr = new String[mapEntry.getValue().size()];
			listOfStringArrays.add(mapEntry.getValue().toArray(arr));
		}
		return listOfStringArrays;
	}
}
