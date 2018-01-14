public class ClientTotalProductsPriceComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Client && o2 instanceof Client))
			throw new ClassCastException();
		double o1Price=((Client)o1).computeFinalProductsPrice();
		double o2Price=((Client)o2).computeFinalProductsPrice();
		return (int)(-1*(o1Price-o2Price));
	}

}
