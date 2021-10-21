package gitProjectTest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("Pakistan");
		al.add("Bangladesh");
		al.add("Srilanka");
		System.out.println("#################### STRING  Type....");
		System.out.println(al);

		System.out.println("Print Separately");
		//Printing all the countries in log

		for (String ele : al) {
			System.out.println(ele);
		}

		ArrayList<Object> al2 = new ArrayList<Object>();
		al2.add("India");
		al2.add(91);
		al2.add(true);
		al2.add(12.5);
		
		System.out.println("####################Object Type....");
		System.out.println(al2);
		for (Object ele2 : al2) {
			System.out.println(ele2);
		}

	}

}
