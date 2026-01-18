import java.util.Scanner;

public class LinkedList {
	Node head;
	public void insertAtHead(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
		
	}
	public void insertAtlast(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	
		
	}
	
	public void deleteAthead() {
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
	
	public void insertAtPos(int data,int pos) {
		Node newNode=new Node(data);
		Node temp=head;
		
		for(int i=1;i<pos-1;i++) {
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	public void deleteAtpos(int pos) {
		Node temp=head;
		for(int i=1;i<pos-1;i++) {
			if(temp.next==null) {
				System.out.println("invalid position");
				return;
			}
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	public void search(int value) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==value) {
				System.out.println("the element is present");
				return;
			}
			temp=temp.next;
		}
	
			System.out.println("the element is not present");
	}
	
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	
	

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.insertAtlast(10);
		l.insertAtlast(20);
		l.insertAtlast(30);
		l.insertAtlast(40);
		
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
				l.insertAtlast(sc.nextInt());
				l.display();
				break;
			case 3:
				l.display();
				break;
			case 4:
				l.deleteAthead();
				l.display();
				
				break;
			case 5:
				l.deleteAtLast();
				l.display();
				break;
			case 6:
				System.out.println("enter the data and position");
				l.insertAtPos(sc.nextInt(), sc.nextInt());
				l.display();
				break;
			case 7:
				System.out.println("enter the position");
				l.deleteAtpos(sc.nextInt());
				l.display();
				break;
				
				
			case 8:
				System.out.println("enter the data you want to search");
				l.search(sc.nextInt());
				
				break;
			case 9:
				exit=true;
				break;
				
				
				
			
			}
			
		}

	}

}
