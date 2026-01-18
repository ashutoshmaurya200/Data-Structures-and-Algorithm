/// stacks using array 



public class Stack {
	public int top;
	public int arr[];
	public int size;
	
	public Stack(int size) {
		this.top=-1;
		this.size=size;
		this.arr=new int[size];
	}
	
	
	public boolean isEmpty() {
		return top==-1;
		
	}
	public boolean isFull() {
		return top==size;
	}
	
	
	public void addElement(int element) {
		if(isFull()) {
			System.out.println("stack is full");
		}
		top++;
		arr[top]=element;
		
		
	}
	
	
	public int deleteElement() {
		if(isEmpty()) {
			System.out.println("the stack is empty");
		}
		int deletedData=arr[top];
		top--;
		return deletedData;
	}
	
	public void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack(5);
		s1.display();
		System.out.println("-------------------");
		s1.addElement(34);
		s1.addElement(67);
		s1.addElement(89);
		s1.display();
		System.out.println("-------------");
		System.out.println(s1.deleteElement());
		
		System.out.println("--------------------");
		s1.display();
		

	}

}
