
public class CircularQueue {
	int front;
	int rear;
	int arr[];
	int size;
	int currSize;
	
	public CircularQueue(int size) {
		this.front=0;
		this.rear=0;
		this.size=size;
		this.arr=new int[size];
		this.currSize=0;
		
	}
	
	public boolean isEmpty() {
		return currSize==0;
	}
	
	public boolean isFull() {
		return currSize==size;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue is full");
		}
		rear=(rear+1)%size;
		arr[rear]=data;
		currSize++;
		
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		int deleted=arr[front];
		front=(front+1)%size;
		currSize--;
		return deleted;
	}
	
	public void display() {
		for(int i=0;i<currSize;i++) {
			System.out.println(arr[i]);
		}
	}
	

	
	
	public static void main(String [] args) {
		
		CircularQueue cq=new CircularQueue(5);
		cq.enqueue(67);
		cq.enqueue(100);
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		
		System.out.println("-------------------");
		cq.display();
		System.out.println("-------------------");
		System.out.println(cq.dequeue());
		
		
	}

}
