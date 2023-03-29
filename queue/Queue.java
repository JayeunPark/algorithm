package queue;

import java.util.NoSuchElementException;

class Queue<T> {
	class Node<T>{
		public T data;
		public Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	public Node<T> first;
	public Node<T> last;
	
	public void add(T data) {
		Node<T> n = new Node<T>(data);
		
		if(first == null) {
			 first = n;
			 last = first;
		}else {
			last.next = n;
			last = n;
		}
	}
	
	public T remove() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		T temp = first.data;
		first = first.next;

//		만약 마지막 노드를 리무브했다면 
//		first.next=null 이기 때문에 first는 null이됨. 
		
//		if(first==null) {
//			last = null;
//		}
		return temp;
	}
	
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public T peek() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		
		return first.data;
	}
	
}
