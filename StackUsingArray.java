public class StackUsingArray {

    public int arr [];
    int top;
    int size ;

    public StackUsingArray(int size){
        this.size=size;
        this.arr =new int[size];
        this.top =0;
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if((size)==top){
            return true;

        }
        return false;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("the stack is full");

        }

        arr[top]=data;
        top++;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
      top--;
      return arr[top];
       
        

    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return arr[top-1];

    }




    public void display(){
        // for(int a:arr){
        //     System.out.println(a);
        // }
        for(int i=0;i<top;i++){
            System.out.println(arr[i]);
        }
    }






 public static void main(String[] args) {
    StackUsingArray st = new StackUsingArray(5);
    st.push(50);
    st.push(45);
    st.push(30);
    st.push(20);
    st.push(10);
     
    
    
    st.display();
     System.out.println("------------------");
      System.out.println(st.pop());
    System.out.println("------------------");
    st.display();
    System.out.println("------------------");
    System.out.println(st.arr[4]);

     System.out.println("------------------");
      System.out.println(st.peek());


 }


    }
    

