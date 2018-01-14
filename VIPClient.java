public class VIPClient extends Client{

	// Constructors
	/**
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public VIPClient(String firstName, String lastName, int id) { ///?
		super(firstName, lastName, id);
	}

	public VIPClient(VIPClient vipClient) {
	    super(vipClient.getFirstName(), vipClient.getLastName(), vipClient.getId());
    }



	// Methods

	/*
	* ADD YOUR METHODS BELOW
	*/
}
