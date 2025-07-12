package javaConcepts.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInertface {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// Read rate is more than remove
		// More cache friendly than linkedList
		list.add("Mango");
		list.add("Tomato");
		list.add("Apple");
		list.add("Santra");
		list.add("Chicku");
		list.add("papai");
		list.add(null);
		list.add(null);
		list.add(null);
		list.add("mi nhi");
		list.add("nkti");

		List<String> d = new LinkedList<>(); // Removal rate is more than Read rate
		d.add("A");
		d.add(null);
		d.add("r");
		System.out.println("Arraylist is:----------");
		for (String fruits : list) {
			System.out.println(fruits);
		}
		System.out.println("LinkedList is-----------");
		for (String f : d) {
			System.out.println(f);
		}

	}

}