import java.util.ArrayList;

public class Stack1st {
    ArrayList<Integer> stack =new ArrayList<>(); 

    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }
       return false;
    }

    public void push(int data){
        stack.add(data);

    }
    public int pop(){
        if(isEmpty()){
            return -1;
        }
       int top= stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return top;
    }

    public int peek(){
        if(isEmpty()){
            return -1;

        }
        int top=stack.get(stack.size()-1);
        return top;
    }
    

    public static void main(String[] args) {
        Stack1st st=new Stack1st();

        st.push(60);
        st.push(50);
        st.push(100);
        st.push(30);
        st.push(20);

        while(!st.isEmpty()){
        //    System.out.println(st.peek()) ;
            System.out.println(st.pop()) ;
        // st.pop();
        }
    }
}
