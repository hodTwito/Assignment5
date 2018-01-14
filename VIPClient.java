public class VIPClient extends Client{

	/**
	 * constructor
	 */
	public VIPClient(String firstName, String lastName, int id) { ///?
		super(firstName, lastName, id);
	}

	/**
	 * copy constructor
	 */
	public VIPClient(VIPClient vipClient) {
	    super(vipClient.getFirstName(), vipClient.getLastName(), vipClient.getId());
    }
	
	/**
	 * vip client shipping price - reduce by a half
	 */
	@Override
	public double computeFinalShippingPrice() { //need a check! TODO
		return super.computeFinalShippingPrice()/2;
	}
}
