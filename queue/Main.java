package queue;

public class Main {
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println("peek: "+q.peek());
		q.add(4);
		q.add(5);
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.isEmpty());
		q.add(6);
		System.out.println(q.remove());

	}
	
}
