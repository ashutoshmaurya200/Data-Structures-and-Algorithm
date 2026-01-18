import java.util.Scanner;

public class DoublyLinkedList {
    Node head;
    
    public void insertAthead(int data) {
    	Node newNode=new Node(data);
    	
    	if(head==null) {
    		head=newNode;
    		return;
    	}
    	
    	newNode.next=head;
    	head.prev=newNode;
    	head=newNode;
    }
    public void insertAtLast(int data) {
    	Node newNode=new Node(data);
    	Node temp=head;
    	if(head==null) {
    		head=newNode;
    		return;
    	}
    	
    	while(temp.next!=null) {
    		temp=temp.next;	
    	}
    	temp.next=newNode;
    	newNode.prev=temp;
    	
    	
    }
    
    public void insertAtpos(int data,int pos) {
    	Node newNode=new Node(data);
    	if(head==null) {
    		head=newNode;
    		return;
    	}
    	
    	Node temp=head;
    	for(int i=1;i<pos-1;i++) {
    		temp=temp.next;
    	}
    	newNode.next=temp.next;
    	temp.next=newNode;
    	newNode.prev=temp;
    	
    }
    
    public void deleteAtHead() {
    	
    	if(head==null) {
    		return;
    	}
    	
    	head=head.next;
    	
    }
    public void deleteAtLast() {
    	Node temp=head;
    	while(temp.next.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=null;
    }
      
    public void display() {
    	Node temp=head;
    	while(temp!=null) {
    		System.out.print(temp.data+"-->");
    		temp=temp.next;
    	}
    }
    public void displayReverse()
    {
    	Node temp=head;
    	while(temp.next!=null) {
    		temp=temp.next;
    	}
    	while(temp!=null) {
    		System.out.print(temp.data+"-->");
    		temp=temp.prev;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DoublyLinkedList l=new DoublyLinkedList();
		l.insertAtLast(10);
		l.insertAtLast(20);
		l.insertAtLast(30);
		l.insertAtLast(40);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		System.out.println("1 for insert at head");
		System.out.println("2 for insert at last");
		System.out.println("3 for display");
		
		boolean exit=false;
		while(!exit) {
			switch(sc.nextInt()) {
			case 1:
				l.insertAthead(sc.nextInt());
				l.display();
				l.displayReverse();
				break;
			case 2:
				l.insertAtLast(sc.nextInt());
				l.display();
				l.displayReverse();
				break;
			case 3:
				l.display();
				l.displayReverse();
				break;
			case 4:
				l.deleteAtHead();
				l.display();
				
				break;
			case 5:
				l.deleteAtLast();
				l.display();
				break;
			case 6:
				System.out.println("enter the data and position");
				l.insertAtpos(sc.nextInt(), sc.nextInt());
				l.display();
				l.displayReverse();
				break;
//			case 7:
//				System.out.println("enter the position");
//				l.deleteAtpos(sc.nextInt());
//				l.display();
//				break;
//				
//				
//			case 8:
//				System.out.println("enter the data you want to search");
//				l.search(sc.nextInt());
				
//				break;
			case 9:
				exit=true;
				break;
				
				
				
			
			}
			
		}

	}

}
