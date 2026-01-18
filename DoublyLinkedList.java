class Node{
    int data;
    Node next;
    Node prev;

   public Node(int data){

    this.data=data;
    this.prev=null;
    this.next=null;

    }
}

public class DoublyLinkedList{
    Node head;

    public  void addNewNode(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        temp.next=newNode;
        newNode.prev=temp;
       
    }

    public  void display(){

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public void displayReverse(){
        Node tail;
        if(head==null){
            return;
        }else{
            tail=head;

        while(tail.next!=null){
            tail=tail.next;
        }

        }
        while(tail!=null){
            System.out.println(tail.data);
            tail=tail.prev;
        }
    }

    

    public static void main(String [] args){

        DoublyLinkedList dl=new DoublyLinkedList();
       dl.addNewNode(10);
       dl.addNewNode(20);
      dl.addNewNode(30);
        dl.addNewNode(40);
        dl.addNewNode(50);

        dl.display();
        System.out.println("------------------");

        dl.displayReverse();
    }
















}