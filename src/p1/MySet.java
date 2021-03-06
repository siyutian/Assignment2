package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class MySet<V> {
	private ArrayList<V> elements;
	private ArrayList<Integer> hashCodes;
	
	public boolean add(V element){
		Iterator<V> it=elements.iterator();
		while(it.hasNext()){
			if(element.equals(it.next()))
				return false;
		}
		elements.add(element);
		hashCodes.add(element.hashCode());
		return true;
		
	}
	public int size(){
		return elements.size();
	}

}
