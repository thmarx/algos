package org.bk.algo.core;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{

	private LinkedList<T> holder = new LinkedList<T>();
	
	public void push(T item){
		holder.insertAtBeginning(item);
		
	}
	
	public T pop(){
		return holder.removeFromBeginning();
	}
	
	public int size(){
		return holder.getSize();
	}

	public boolean isEmpty(){
		return this.size()==0;
	}
	
	@Override
	public Iterator<T> iterator() {
		return holder.reverseIterator();
	}
}
