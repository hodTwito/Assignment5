public class LinkedList implements List{

	// Fields
	private Link head, tail; //pointers to the head of the list and the tail of the list.
	private int size; //the size of the list.


    /**
     * default constructor
     */
	public LinkedList (){
		head = null;
		tail = null;
	}

    /**
     * copy constructor
     * @param list the list being copied.
     */
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

    /**
     * adds an element to the end of the list.
     * @param element the element that will be added.
     */
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

    /**
     * adds an element to a certain index in the list, pushes all elements ofter that index one index forward.
     * @param index the index in which the element will be added.
     * @param element the element that will be added.
     */
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

    /**
     * @return the size of the list
     */
    public int size() {
        return size;
    }

    /**
     * checks if the list contains a certain element.
     * @param element the element being searched for.
     * @return true if the list contains <code>element</code> and false otherwise.
     */
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

    /**
     * @return true if the list is empty and false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @param index the index of the desired element.
     * @return the element of the list at <code>index</code>
     */
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

    /**
     * replaces an element of the list with a new element.
     * @param index the index of the element we want to change.
     * @param element the new element that will be placed in the list.
     * @return
     */
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

    /**
     * sorts the list using a specific comparator.
     * @param comp a comparator that specifies the required ordering of the lists elements.
     */
	public void sortBy(Comparator comp) {
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

    /**
     * @return a string describing the list.
     */
	@Override
    public String toString() {
        //TODO: see when we need to start a new line.
        String result = "";
	    if(this.isEmpty()) return result;
	    else result = "List: "; //???
	    Link pointer = head;
	    while(pointer != null) {
	        result += pointer.toString();
	        pointer = pointer.getNext();
        }
	    return result;
    }

    /**
     * checks if the list obj is equal to this list, if obj is a list.
     * @param obj the list being compared with this list.
     * @return true if all elements of both lists are the same and are ordered the same way.
     */
    @Override
    public boolean equals(Object obj) {
	    if(obj instanceof LinkedList) {
	        LinkedList other = (LinkedList)obj;
	        if(this.size != other.size) return false;
	        else {
	            Link pointerThis = this.head;
	            Link pointerOther = other.head;
	            while(pointerThis != null) {
	                if(!pointerThis.equals(pointerOther)) return false; 
	                pointerThis = pointerThis.getNext();
	                pointerOther = pointerOther.getNext();
                }
                return true;
            }
        }
        return false;
    }
    
    /**
     * swaps two objects (by reference).
     * @param obj1 first object
     * @param obj2 second object
     */
    private void swap(Object obj1, Object obj2) {
        //TODO: see if this is a good way to swap.
	    Object temp = obj1;
	    obj1 = obj2;
	    obj2 = temp;
    }

}
