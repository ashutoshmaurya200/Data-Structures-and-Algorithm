class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedList{
    Node head;

    public void addNewNode(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return ;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }

    

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data + "---->");
            temp=temp.next;
        }
        

    }

    public static void main(String[] args){

        LinkedList l1=new LinkedList();

        l1.addNewNode(40);
        l1.addNewNode(50);
        l1.addNewNode(60);
        l1.addNewNode(70);
        l1.addNewNode(80);

        l1.display();

    }

  
}