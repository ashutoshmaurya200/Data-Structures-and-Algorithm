
public class LinerQueue {
	
	int front;
	int rear;
	int arr[];
	int size;
	
	public LinerQueue(int size) {
		this.front=0;
		this.rear=-1;
		this.size=size;
		this.arr=new int[size];
		
	}
	
	public boolean isEmpty() {
		return rear==front;
		
	}
	public boolean isFull() {
		return rear==size;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue is full");
		}
		
		rear++;
		arr[rear]=data;
		
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		int deleted=arr[front];
		front++;
		return deleted;
	}
	
	public void display() {
		for(int i=front;i<=rear;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinerQueue lq=new LinerQueue(5);
		lq.enqueue(34);
		lq.enqueue(90);
		lq.enqueue(67);
		lq.enqueue(23);
		lq.enqueue(43);
		System.out.println("------------------------");
		lq.display();
		System.out.println("------------------------");
		System.out.println(lq.dequeue());
		System.out.println("-------------------------");
		lq.display();
		

	}

}
