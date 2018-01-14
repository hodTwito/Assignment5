public class LinkedList implements List{

	// Fields
	private Link head, tail;
	private int size;
	
	
	// Constructors
	public LinkedList (){
		head = null;
		tail = null;
	}
	//copy constructor
	public LinkedList (LinkedList list){
		if(list.head != null){
			this.head = new Link(list.head);
			Link pointer = this.head;
			while(pointer.getNext() != null){
				pointer = pointer.getNext();
			}
			this.tail = pointer;
		}
		this.size = list.size;
	}
	
	
	// Methods
	public void add(Object element){
		if(element == null){
			throw new NullPointerException();
		}
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
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException();
		if(element == null){
			throw new NullPointerException();
		}
		if(index == 0){
	        Link newLink = new Link(element, null);
	        newLink.setNext(head);
	        head = newLink;
		}
		else {
			int listIndex = 1;
			Link pointer = head;
			Link pointerNext = head.getNext();
			while(listIndex < index){
				pointer = pointerNext;
				if(pointer.getNext() != null)
					pointerNext = pointerNext.getNext();
				listIndex++;
			}
	        Link newLink = new Link(element, null);
	        newLink.setNext(pointer.getNext());
	        pointer.setNext(newLink);
		}
	}

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object element) {
	    if(element == null || size == 0) return false;
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
	        while(index > -1) {
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
            while(index > -1) {
                pointer = pointer.getNext();
                index--;
            }
            Object currentData = pointer.getData();
            pointer.setData(element);
            return currentData;
        }
	}

	public void sortBy(Comperator comp) {
	    if(comp == null) throw new NullPointerException("comparator cant be null");
	    //TODO: maybe improve efficiency and not use the get function.
	    int minIndex = 0;
	    for(int i = 0; i < size - 1; i++) {
	        minIndex = i;
	        for(int j = i; j < size; j++) {
	            if(comp.compare(this.get(j), this.get(minIndex)) < 0) {
	                minIndex = j;
                }
                swap(this.get(i), this.get(j));
            }
        }
	}

    public void swap(Object obj1, Object obj2) {
	    Object temp = obj1;
	    obj1 = obj2;
	    obj2 = temp;
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
                return true;
            }
        }
        return false;
    }
}
