package stack;

public class Main {
public static void main(String[] args) {
	Stack<Integer> s = new Stack<>();
	s.push(1);	
	s.push(2);	
	s.push(3);	
	System.out.println("peek: "+s.peek());
	s.push(4);	
	s.push(5);	
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.isEmpty());
	System.out.println(s.pop());
	System.out.println(s.pop());
	System.out.println(s.isEmpty());
	
	
}
}
