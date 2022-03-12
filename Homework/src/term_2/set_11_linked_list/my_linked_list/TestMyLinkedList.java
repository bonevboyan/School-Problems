package term_2.set_11_linked_list.my_linked_list;

import java.util.Iterator;

public class TestMyLinkedList {

	public static void main(String[] args) {
		
		MyLinkedList<String> list = new MyLinkedList<>();
		
		list.addLast("America");
		System.out.println("(1) " + list);
		
		list.add(0, "Canada");
		System.out.println("(2) " + list);

		list.addLast("Russia");
		System.out.println("(3) " + list);
		
		list.addLast("France");
		System.out.println("(4) " + list);
		
		list.add(2, "Germany");
		System.out.println("(5) " + list);
		
		list.add(5, "Norway"); 
		System.out.println("(6) " + list);
		
		list.add(0, "Poland");
		System.out.println("(7) " + list);
		
		
		list.remove(0);
		System.out.println("(8) " + list);
		
		list.remove(2);
		System.out.println("(9) " + list);
		
		list.remove(list.size() - 1); 
		System.out.print("(10) " + list + "\n(11) ");
		
		Iterator<String> iter = list.iterator();
		while (iter.hasNext())
			System.out.print(iter.next().toUpperCase() + " ");
		
		list.clear();
		System.out.println("\nAfter clearing the list, the list size is "+ list.size());

	}

}
