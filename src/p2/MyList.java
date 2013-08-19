package p2;
public class MyList<T>{
	int size;
	Node<T> head=null;
	public MyList(){
	size=0;	
	}
	public void addLast(T a){
		Node<T> tmp=head;
		while(tmp.next!=null){
			tmp=tmp.next;
		}
		tmp=new Node<T>(a);
		size++;
	}
	public void addFirst(T a){
		Node<T> tmp=new Node<T>(a);
		tmp.next=head;
		head=tmp;
		size++;
	}
}

class Node<T>{
	private T a;
	Node<T> next=null;
	public Node(){
		
	}
	public Node(T a){
		this.a=a;
	}
	

}
