public class ClientTotalProductsPriceComparator implements Comperator {
	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Client && o2 instanceof Client))
			throw new ClassCastException();
		double o1Price=((Client)o1).calculateTotalPriceOfProducts();
		double o2Price=((Client)o2).calculateTotalPriceOfProducts();
		return (int)(-1*(o1Price-o2Price));
	}

}
