public class LinearQueue {
    int front ;
    int arr[];
    int rear;
    int size;

    public LinearQueue(int size){
        this.size=size;
        this.arr =new int[size];
        this.front =0;
        this.rear =-1;


    }

    public boolean isFull(){
        if(rear==size){ // here i found a error
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(front == rear){
            return true;
        }
        return false;

    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("the array is full");
        }

        arr[++rear]=data;
        //rear++;
    
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
       // front --;
        return arr[front++];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("the array is empty ");
        }
        return arr[front];
    }
    public void display(){
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        LinearQueue lq =new LinearQueue(5);
         lq.enqueue(10);
         lq.enqueue(20);
         lq.enqueue(30);
         lq.enqueue(40);
         lq.enqueue(50);
         lq.display();
         System.out.println("------------------");
        
        System.out.println(lq.dequeue());
        System.out.println("------------------");
        
        System.out.println("------------------");
        System.out.println(lq.peek());
        


        


    }
    
}
