public class VIPClient extends Client{

	/**
	 * constructor
	 */
	public VIPClient(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
	}

	/**
	 * copy constructor
	 * @param other
	 */
	public VIPClient(Object other) {
		super(other);
	}
	
	/**
	 * vip client shipping price - reduce by a half
	 */
	@Override
	public double computeFinalShippingPrice() {
		return super.computeFinalShippingPrice()/2;
	}
}
