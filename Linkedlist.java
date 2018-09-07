import java.util.LinkedList;
import java.util.*;


public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> ll= new LinkedList<Integer>();
		ll.add(10);
		ll.add(30);
		ll.add(50);
		
		Iterator<Integer> ite=ll.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
	}

}
