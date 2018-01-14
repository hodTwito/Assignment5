public class Link{

	// Fields
	private Object data;
	private Link next;


	// Constructors
	public Link(Object data){
		this(data, null);
	}

	public Link(Object data, Link next)	{
		this.data = data;
		this.next = next;
	}

	public Link(Link link)	{
		if(link.getData() instanceof Client)
			this.data = new Client((Client) link.getData());
		else if(link.getData() instanceof VIPClient)
			this.data = new VIPClient((VIPClient)link.getData());
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


	// Methods
	public Object getData(){
		return data;
	}

	public Link getNext() {
		return next;
	}

	public void setNext(Link next) {
		this.next = next;
	}

	public Object setData(Object data) {
		Object res = this.data;
		this.data = data;
		return res;
	}

	public String toString(){
		return data.toString();
	}

	public boolean equals(Object other) {
		if(other instanceof Link) {
			Link otherLink = (Link)other;
			return this.data.equals(otherLink.data);
		}
		return false;
	}
}