
public class ClientNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Client && o2 instanceof Client))
			throw new ClassCastException();
		String o1Name=((Client)o1).getFirstName()+((Client)o1).getLastName();
		String o2Name=((Client)o2).getFirstName()+((Client)o2).getLastName();
		return o1Name.compareTo(o2Name);
	}
}
