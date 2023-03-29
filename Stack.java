package stack;

import java.util.EmptyStackException;

class Stack<T> {
	class Node<E>{
		public E data;
		public Node<E> prev;
		
		public Node(E data) {
			this.data = data;
		}
	}	
	 
	public Node<T> top;
	
// 데이터 추가	
	public void push(T item) {
		Node<T> n = new Node<T>(item);
		n.prev = top;
		top = n;
	}
	
//	탑 데이터를 반환
	public T pop() {
		if(top==null)
			throw new EmptyStackException();
		T temp = top.data;
		top = top.prev;
		 
		return temp;
	} 
	
//	탑이 비어있는지 확인
	public boolean isEmpty() {
		return top==null;
	}
	
//	탑의 데이터 확인
	public T peek() {
		if(top==null)
			throw new EmptyStackException();
		return top.data;
	}
}


