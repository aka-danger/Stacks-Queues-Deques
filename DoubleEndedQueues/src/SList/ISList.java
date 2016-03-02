package SList;

public interface ISList<T>{
	
	public void push(T element);//add to last
	public T pop();//remove last
	public T top();
	public int size();
	public boolean isEmpty ();
	
}
