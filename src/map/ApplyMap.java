package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplyMap {

	public static void main(String[] args) {
		/*
		 * UseMap() can be utilize here.
		 */
		// Adding a data and Value in Map
		UseMap usobj = new UseMap();
		usobj.addElementByMap("1","Audi");
		usobj.addElementByMap("2","Ford");
		usobj.addElementByMap("3","Mercedes");
		usobj.addElementByMap("4","BMW");

		// Get Elements from Map
		String[] mp = usobj.getDataByMap();
		System.out.println("Output of Data containig map");
		System.out.println("" + Arrays.asList(mp));

		Map<String, List<String>> listData = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("mac");
		list.add("smith");
		list.add("john");
		listData.put("Ford", list);
		List<String[]> newlistData = usobj.getDataByMapList(listData);
		System.out.println("List Data for Map Containing list");
		for (String[] strings : newlistData) {
			System.out.println(Arrays.asList(strings));
		}

	}

}
