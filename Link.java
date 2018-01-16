public class Link{

	private Object data; //the data contained in the link.
	private Link next; //a pointer to the next link in a chain.

	/**
	 * constructor
	 * @param data to insert in the link
	 * create link with null next
	 */
	public Link(Object data){
		this(data, null);
	}

	/**
	 * constructor
	 * @param data- data inside the link
	 * @param next- the next link in the list
	 */
	public Link(Object data, Link next)	{
		this.data = data;
		this.next = next;
	}

	/**
	 * copy constructor
	 * @param link to copy to a new link
	 */
	public Link(Link link)	{
		if(link.getData() instanceof Client)
			this.data = new Client((Client) link.getData());
		else if(link.getData() instanceof VIPClient)
			this.data = new VIPClient((VIPClient) link.getData());
		else if(link.getData() instanceof ProductInStore)
			this.data = new ProductInStore((ProductInStore) link.getData());
		else if(link.getData() instanceof ProductInStorageSmall)
			this.data = new ProductInStorageSmall((ProductInStorageSmall) link.getData());
		else if(link.getData() instanceof ProductInStorageMedium)
			this.data = new ProductInStorageMedium((ProductInStorageMedium) link.getData());
		else this.data = new ProductInStorageLarge((ProductInStorageLarge) link.getData());
		if(link.getNext() != null){
			this.next = new Link (link.getNext());
		}
		else this.next = null;
	}


	/** 
	 * @return the data in the link
	 */
	public Object getData(){
		return data;
	}

	/**
	 * @return the next link
	 */
	public Link getNext() {
		return next;
	}

	/**
	 * change the next link
	 * @param next- new link to the next
	 */
	public void setNext(Link next) {
		this.next = next;
	}

	/**
	 * change the data in the link
	 * @param data- new data to insert the link
	 * @return the old data in the link
	 */
	public Object setData(Object data) {
		Object res = this.data;
		this.data = data;
		return res;
	}

	/**
	 * @return string contains the data in the link
	 */
	@Override
	public String toString(){
		return data.toString();
	}

	/**
	 * @return true if other is a link equals to this link
	 * two links are equal if the data in them is equal
	 */
	@Override
	public boolean equals(Object other) {
		if(other instanceof Link) {
			Link otherLink = (Link)other;
			return this.data.equals(otherLink.data);
		}
		return false;
	}
}