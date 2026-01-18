public class CiruclarQueue {

    public int size;
    public int arr[];
    
    int front;
    int rear;
    int currSize;

    public CiruclarQueue(int size){
        this.size=size;
        this.arr=new int[size];
        this.front=0;
        this.rear=-1;
    }

    public boolean isEmpty(){
      return currSize==0;
    
   
    }
    public boolean isFull(){
       return currSize==size;

    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("the queue is full");
        }

        rear=(rear+1)%size;
        arr[rear]=data;
        currSize++;

    }

    public int peek(){
        return arr[front];
      
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
        }
        front=(front+1)%size;
        currSize--;
      
    }

   public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int index = front;
        for (int i = 0; i < currSize; i++) {
            System.out.println(arr[index]);
            index = (index + 1) % size;
        }
    }


    public static void main(String[] args) {
        CiruclarQueue cq=new CiruclarQueue(5);
        cq.enqueue(45);
        cq.enqueue(67);
        
          cq.enqueue(60);
            cq.enqueue(57);
              cq.enqueue(90);


              System.out.println( cq.peek());
              cq.display();
              System.out.println("--------------------");
              cq.dequeue();
                 System.out.println("--------------------");
          cq.display();
             System.out.println("--------------------");
              System.out.println( cq.peek());
                 System.out.println("--------------------");
                

    }


}
