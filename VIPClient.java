public class VIPClient extends Client{

	/**
	 * constructor
	 */
	public VIPClient(String firstName, String lastName, int id) { ///?
		super(firstName, lastName, id);
	}

	/**
	 * copy constructor- by VIPVlient
	 */
	public VIPClient(VIPClient vipClient) {
	    super(vipClient.getFirstName(), vipClient.getLastName(), vipClient.getId());
    }
	/**
	 * copy constructor- by Object
	 * @param other
	 */
	public VIPClient(Object other) {
		this((VIPClient)other);
	}
	
	/**
	 * vip client shipping price - reduce by a half
	 */
	@Override
	public double computeFinalShippingPrice() { //need a check! TODO
		return super.computeFinalShippingPrice()/2;
	}
}
