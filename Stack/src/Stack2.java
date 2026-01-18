//stack using arraylist

import java.util.ArrayList;
import java.util.List;


public class Stack2 {
	List<Integer> stack=new ArrayList<>();
	
	public boolean isEmpty() {
		return stack.size()==0;
	}
	
	public void push(int data) {
		stack.add(data);		
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		
		
		return stack.get(stack.size()-1);
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		int deleted = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return deleted;
	}
	
	public void display() {
		for(int list:stack) {
			System.out.println(list);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Stack2 s2=new Stack2();
	  s2.push(34);
	  s2.push(14);
	  s2.push(54);
	  s2.push(37);
	  s2.push(39);
	  System.out.println("-----------------");
	  s2.display();
	  System.out.println("-----------------");
	  s2.peek();
	  System.out.println("-----------------");
	  
	  System.out.println( s2.pop());
	 
	  
	  



	}
}
