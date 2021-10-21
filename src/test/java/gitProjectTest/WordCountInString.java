package gitProjectTest;

import java.util.HashMap;

public class WordCountInString {

	public static void main(String[] args) {

		String StringValue = "SAI RAM SAI SHYAM RAM";

		String strList[] = StringValue.split(" ");

		System.out.println("Words count is:" + strList.length);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int count = 1;

		for (int i = 0; i < strList.length; i++) {
			if (!map.containsKey(strList[i])) {
				map.put(strList[i], count);
			} else {
				map.put(strList[i], map.get(strList[i]) + 1);
			}
		}
		
		System.out.println("MAP:"+map);
		
		for(String x:map.keySet()) {
			
			System.out.println("The count of word "+x+"="+map.get(x));
		}

	}

}
