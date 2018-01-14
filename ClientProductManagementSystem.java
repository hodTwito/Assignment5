public class ClientProductManagementSystem {
	private LinkedList clients;
	private LinkedList products;
	
	/**
	 * constructor
	 */
	public ClientProductManagementSystem() {
		this.clients=new LinkedList();
		this.products=new LinkedList();
	}
	
	/** @return number of clients in the list*/
	public int getNumberOfClients() {return this.clients.size();}
	
	/** @return number of products in the list*/
	public int getNumberOfProducts() {return this.products.size();}
	
	/**
	 * @param client- new client to add to the list
	 * @return true if client can be added to the list, false else
	 * new client can be added to the list if he doesn't exist already in the clients list
	 */
	public boolean addClient(Client client) {
		if(!this.clients.contains(client)) {//client doesn't exist in the clients list
			this.clients.add(client); //add client to the clients list
			return true;
		}
		return false;
	}
	
	/**
	 * @param product- new product to add to the list
	 * @return true if product can be added to the list, false else
	 * new product can be added to the list if he doesn't exist already in the products list
	 */
	public boolean addProduct(Product product) {
		if(!this.products.contains(product)) {//product doesn't exist in the products list
			this.products.add(product); //add product to the products list
			return true;
		}
		return false;
	}
	
	/**
	 * @param client
	 * @param product
	 * @return true if product added to client's products list
	 * product can be added to client's products list if both client and product exist in the clients and products list
	 * and the product doesnt exist in the client's products list
	 */
	public boolean addProductToClient(Client client, Product product) {
		if(clients.contains(client)&&products.contains(product)) //check if client and product exist in the lists
			if(client.addProduct(product))//try add product to client
				return true; //added successfully
		return false; //couldn't add
	}

	/**
	 * @param comp- comparator to order the clients by
	 * @param k
	 * @return linked list sorted by comp comperator, contains the first k clients
	 */
	public LinkedList getFirstKclients(Comparator comp, int k) {
		this.clients.sortBy(comp); //sort clients by comp
		LinkedList firstKclients=new LinkedList();
		while(k>0) {
			firstKclients.add(this.clients.get(k)); //insert first k clients to the list
			k--;
		}
		return firstKclients;
	}
	
	/**
	 * @param client
	 * @return final price of the client's order
	 * return 0 if the client isn't resisted in the system
	 */
	public double computeFinalOrderPrice(Client client) {
		if(this.clients.contains(client)) //check if client resisted
			return client.computeFinalOrderPrice();
		return 0;
	}
}
