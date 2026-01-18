import java.util.Scanner;

public class CircularLinkedList {
	Node head;
	Node tail;
	 public CircularLinkedList(){
		 this.head=null;
		 this.tail=null;
		 
	 }
	 
	 
	 public void insertAtHead(int data) {
		 Node newNode=new Node(data);
		
		 if(head==null) {
			 head=tail=newNode;
			 return;
		 }
		 newNode.next=head;
		 head=newNode;
		 tail.next=head;
	 }
	 
	 public void insertAtLast(int data) {
		 Node newNode=new Node(data);
		 
		 if(head==null) {
			 head=tail=newNode;
			 return;
			 
		 }
		 
		 Node temp=head;
		 while(temp!=tail) {
			 temp=temp.next;
			 
		 }
		 temp.next=newNode;
		 tail=newNode;
		 tail.next=head;
	 }
	 
	 public void insertAt(int data,int pos) {
		 Node newNode=new Node(data);
		 if(head==null) {
			 head=tail=null;
			 return;
		 }
		 Node temp=head;
		 
		 for(int i=0;i<pos-1;i++) {
			 temp=temp.next;
		 }
		 
		 newNode.next=temp.next;
		 temp.next=newNode;
		 
	 }
	 
	 public void deleteAtHead() {
		 if(head==null) {
			 return;
		 }
		 if(head.next==null) {
			 head=tail=null;
			 return;
		 }
		 head=head.next;
		 tail.next=head;
		 
	 }
	 public void deleteAtLast() {
		 if(head==null) {
			 return;
		 }
		 if(head.next==null) {
			 head=tail=null;
			 return;
		 }
		 Node temp=head;
		 while(temp.next!=tail) {
			 temp=temp.next;
		 }
		 temp.next=head;
		 tail=temp;
		 
	 }
	 
	 public void deleteAtPos(int pos) {
		 Node temp=head;
		 for(int i=1;i<pos-1;i++) {
			 temp=temp.next;
		 }
		 temp.next=temp.next.next;
	 }
	 
//	 public void searchbyvalue(int data) {
//		 Node temp=head;
//		 while(temp!=tail) {
//			 if(temp.data==data) {
//				 System.out.println("the element is present");
//				 return;
//			 }
//			 temp=temp.next;
//		 }
//		 System.out.println("the element is not present");
//		 
//		 
//	 }
	 
	 public void searchbyvalue(int data) {
		 Node temp=head;
		 do {
			 if(temp.data==data) {
				 System.out.println("the element is present");
				 return;
			 }
			 temp=temp.next;
		 }while(temp!=head); 
			
		 System.out.println("the element is not present");
	 }
	 
	 public void display() {
		 Node temp=head;
		 while(temp!=tail) {
			 System.out.print(temp.data+"-->");
			 temp=temp.next;
		 }
		 System.out.print(temp.data+"-->");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CircularLinkedList l=new CircularLinkedList();
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
				l.insertAtHead(sc.nextInt());
				l.display();
				break;
			case 2:
				l.insertAtLast(sc.nextInt());
				l.display();
				break;
			case 3:
				l.display();
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
				l.insertAt(sc.nextInt(), sc.nextInt());
				l.display();
				break;
			case 7:
				System.out.println("enter the position");
				l.deleteAtPos(sc.nextInt());
				l.display();
				break;
				
				
			case 8:
				System.out.println("enter the data you want to search");
				l.searchbyvalue(sc.nextInt());
				
				break;
			case 9:
				exit=true;
				break;
				
				
				
			
			}
			
		}


	}

}
