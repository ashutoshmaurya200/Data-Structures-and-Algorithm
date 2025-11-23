import java.util.*;

public class BottomOfStack {

    public void bottomOfStack(int data , Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return ;
        }
        
        int top =s.pop();
        bottomOfStack(data, s);
        s.push(top);

    }

    public static void main(String[] args) {
        BottomOfStack bs =new BottomOfStack();
       Stack<Integer> s =new Stack<>();
       s.push(2);
       s.push (5);
       s.push(1);
       
       bs.bottomOfStack(4, s);

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }
    
}
