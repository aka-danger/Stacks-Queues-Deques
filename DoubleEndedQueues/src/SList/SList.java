package SList;

public class SList<T> implements ISList<T> {

	private Node<T> head = null ;
	private Node<T> tail = null;
	private int size = 0;
	
	public SList(){
	
	}
	
	@Override
	//add last
	public void push(T element) {
		if(isEmpty()){
			head = new Node<T>(element, null);
			tail = head;
			size++;
		}else{
			 Node<T> newNode= new Node<T>(element, null);
			//tail = newNode;
			tail.setNext(newNode);
			tail = newNode;
			size++;
		}
	}

	@Override
	//remove last and show the element
	public T pop() {
		if(isEmpty()) return null ;
		//Node<T> temp = tail;
		Node<T> temp = null;
		Node<T> i = head;
		while(i != tail.getNext()){
			if(i.getNext() == tail){
				temp = tail;
				i.setNext(null);
				tail = i ;
				size--;
			}
			i = i.getNext();
		}
		return temp.getElement();
	}

	@Override
	public T top() {
		// TODO Auto-generated method stub
		return tail.getElement();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}
	
	public String toString(){
		String result = "";
		
		Node<T> i = head;
		while(i!= tail.getNext()){
			result+= String.valueOf(i.getElement()) + " ";
			i =i.getNext();
		}
		return result;
	}

}