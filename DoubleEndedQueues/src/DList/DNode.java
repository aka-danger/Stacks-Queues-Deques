package DList;

public class DNode<T> {
	
	private DNode<T> prev;
	private DNode<T> next;
	private T element;
	
	
	public DNode(T element, DNode<T>  prev, DNode<T>  next) {
		super();
		this.prev = prev;
		this.next = next;
		this.element = element;
	}
	
	
	public DNode<T>  getPrev() {
		return prev;
	}
	public void setPrev(DNode<T>  prev) {
		this.prev = prev;
	}
	public DNode<T>  getNext() {
		return next;
	}
	public void setNext(DNode<T>  next) {
		this.next = next;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	
	

}
