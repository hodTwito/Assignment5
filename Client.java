public class Client {
	
	private String firstName;
	private String lastName;
	private int id;
	private LinkedList products;
	
	
	/**
	 * @param firstName of client
	 * @param lastName of the client
	 * @param id of the client
	 */
	public Client(String firstName, String lastName, int id){
		if(isLegalName(firstName)||isLegalName(lastName)||id<=0)
			throw new IllegalArgumentException();
		this.firstName=firstName;
		this.lastName=lastName;
		this.id=id;
		this.products=new LinkedList();
	}
	
	/**
	 * copy constructor
	 */
	public Client(Client client) {
		this(client.firstName,client.lastName,client.id);
		this.products=client.getProducts();
	}
	
	/**get client's last name*/
	public String getLastName() {return this.lastName;}

	/**get client's first name*/
	public String getFirstName() {return this.firstName;}
	
	/**get client's id*/
	public int getId() {return this.id;}
	
	/**get client's list of products*/
	public LinkedList getProducts() {return new LinkedList(products);}
	
	/**
	 * @param product
	 * @return true if product is in the client's list, false else
	 */
	public boolean isInterestedIn(Product product) {
		return this.products.contains(product);
	}
	
	/**
	 * @param product- product to add to the client's list
	 * @return true if product can be added* to the list, false else
	 * *a product can be added to the client's list if it doesnt already exist in it
	 */
	public boolean addProduct(Product product) {
		if(!this.isInterestedIn(product)) {
			this.products.add(product);
			return true;
		}
		return false;
	}
	
	/**
	 * @return sum of all prices of the products in the client's list
	 */
	public double computeFinalProductsPrice() {
		double totalPrice=0;
		for (int i = 0; i < products.size(); i++)
			totalPrice+=((Product)products.get(i)).computeFinalPrice()[0];
		return totalPrice;
	}
	
	/**
	 * @return sum of all shipping prices of the products in the client's list
	 */
	public double computeFinalShippingPrice() {
		double totalPrice=0;
		for (int i = 0; i < products.size(); i++)
			totalPrice+=((Product)products.get(i)).computeFinalPrice()[1];
		return totalPrice;
	}
	
	/**
	 * @return sum price of all the client's order price, shipping and products
	 */
	public double computeFinalOrderPrice() {
		return this.computeFinalProductsPrice()+this.computeFinalShippingPrice();
	}
	
	/**
	 * @return string contains the data about the client and all his products
	 */
	@Override
	public String toString() {
		return "Client: "+this.firstName+" "+this.lastName+", "+this.id+
				", "+this.computeFinalOrderPrice()+", Products:\n"+this.products.toString();
	}
	
	/**
	 * @return true if other is a client who is the same* as this client
	 * *two clients are the same if they have the same id number
	 */
	@Override
	public boolean equals(Object other) {
		if(other instanceof Client)
			if(((Client)other).id==this.id)
				return true;
		return false;
	}
	
	/**
	 * @param name
	 * @return true if name is legal, false else
	 */
	private boolean isLegalName(String name) {
		if(name==null||name.length()<0)//null or illegal length
			return false;
		for (int i = 0; i < name.length(); i++)
			if(name.charAt(i)<65||(name.charAt(i)>90&&name.charAt(i)<97)||name.charAt(i)>122)//char isn't a letter
				return false;
		return true;
	}
}
