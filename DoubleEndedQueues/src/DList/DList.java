package DList;

public class DList<T> implements Deque<T> {

	private DNode<T> head = null;
	private DNode<T> tail = null;
	private int size = 0 ;
	
	public DList(){
		head = new DNode<T>(null,null, null);
		tail = new DNode<T>(null,head,null);
		head.setNext(tail);
		size = 0 ;
	}
	
	@Override
	public void addFirst(T element) {
		addBetween(element, head, head.getNext());
		size ++;
	}

	@Override
	public void addLast(T element) {
		addBetween(element, tail.getPrev(), tail);
		size++;
	}
	
	private void addBetween(T element, DNode<T> prev, DNode<T> next){
		DNode<T> newNode = new DNode<>(element,prev,next);
		prev.setNext(newNode);
		next.setPrev(newNode);
	}
	
	private T remove(DNode<T> node){
		DNode<T> prev = node.getPrev();
		DNode<T> next = node.getNext();
		prev.setNext(next);
		next.setPrev(prev);
		size--;
		return node.getElement(); // returns node that was removed
	}

	@Override
	public T removeFirst() {
		if(isEmpty()) return null;
		return remove(head.getNext());
	}

	@Override
	public T removeLast() {
		if(isEmpty()) return null;
		return remove(head.getNext());
	}

	@Override
	public T first() {
		return head.getNext().getElement();
	}

	@Override
	public T last() {
		return tail.getPrev().getElement();
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return (size ==0);
	}
	
	public String toString(){
		String result = "";
		DNode<T> i = head.getNext();
		
		while(i != tail){
			result += String.valueOf(i.getElement()) + " ";
			i = i.getNext();
		}	
		return result;
	}

}
