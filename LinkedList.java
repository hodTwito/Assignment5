public class LinkedList implements List{

	// Fields
	Link head, tail;
	int size;


	// Constructors
	public LinkedList (){
		head = null;
		tail = null;
	}
	//copy constructor
	public LinkedList (LinkedList list){
		this.head = new Link(list.head);
		Link pointer = this.head;
		//TODO: check if this is true, should be pointer.getData != null because the while wont reach the last element since it's getNext is null.
		while(pointer.getNext() != null){
			pointer = pointer.getNext();
		}
		this.tail = pointer;
	}


	// Methods
	public void add(Object element){
		if(element == null) throw new NullPointerException("can not add null element to the list");
		if(isEmpty())
		{
			Link newLink = new Link(element, null);
			head = newLink;
			tail = newLink;
		}
		else
		{
			Link newLink = new Link(element, null);
			tail.setNext(newLink);
			tail = newLink;
		}
		size++;
	}

	public void add(int index, Object element){
		if(element == null) throw new NullPointerException("can not add null element to the list");
		//TODO: ask if i can change the implementation of the exception and add text.
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException();
		if(index == 0){
			Link newLink = new Link(element, null);
			newLink.setNext(head);
			head = newLink;
		}
		else{
			int listIndex = 0;
			Link curr = head;
			while(listIndex+1 < index){
				curr = curr.getNext();
				listIndex++;
			}
			Link newLink = new Link(element, null);
			newLink.setNext(curr.getNext());
			curr.setNext(newLink);
		}
	}
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object element) {
		if(element == null) return false;
		else {
			Link pointer = head;
			int index = 0;
			while(index < size && !pointer.getData().equals(element)) {
				pointer = pointer.getNext();
				index++;
			}
			return pointer.getData().equals(element);
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public Object get(int index) {
		if(index < 0) throw new IndexOutOfBoundsException("index smaller then 0");
		else if(index > size) throw new IndexOutOfBoundsException("index is greater then list size");
		else {
			Link pointer = head;
			while(index > 0) {
				pointer = pointer.getNext();
				index--;
			}
			return pointer.getData();
		}
	}

	@Override
	public Object set(int index, Object element) {
		if(index < 0) throw new IndexOutOfBoundsException("index smaller then 0");
		else if(index > size) throw new IndexOutOfBoundsException("index is greater then list size");
		else if(element == null) throw new NullPointerException("can not add null element to the list.");
		else {
			Link pointer = head;
			while(index > 0) {
				pointer = pointer.getNext();
				index--;
			}
			Object currentData = pointer.getData();
			pointer.setData(element);
			return currentData;
		}
	}


	//TODO: see when we need to start a new line.
	@Override
	public String toString() {
		String result = "";
		if(this.isEmpty()) return result;
		else result = "List: ";
		Link pointer = head;
		while(pointer != null) {
			result += pointer.toString();
			pointer = pointer.getNext();
		}
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LinkedList) {
			LinkedList other = (LinkedList)obj;
			if(this.size != other.size) return false;
			else {
				Link pointerThis = this.head;
				Link pointerOther = other.head;
				while(pointerThis != null) {
					if(pointerThis.getData() != pointerOther.getData()) return false;
					pointerThis = pointerThis.getNext();
					pointerOther = pointerOther.getNext();
				}
			}
		}
		return false;
	}
	//sortBy
}