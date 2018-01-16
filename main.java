
public class main {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(5);
		ll.add(1);
		ll.add(8);
		ll.add(3);
		System.out.println(ll);
		System.out.println();
		//ll.set(1, 2);
		Comparator comp=new IntegerComparator();
		ll.sortBy(comp);
		System.out.println(ll);
		
	}

}
