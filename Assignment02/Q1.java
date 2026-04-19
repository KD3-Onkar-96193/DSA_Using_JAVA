package assi2;

public class singlycircusingtailonly {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	
	public singlycircusingtailonly() {
		 tail = null;
	}

	public boolean isEmpty() {
		return tail == null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		if(tail == null){
		    tail = newnode;
		    tail.next = tail;
		}
		else{
		    newnode.next = tail.next;
		    tail.next = newnode;
		}
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(tail== null) {
			tail.next = tail = newnode;
			newnode.next = newnode;
		}
		else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	public void deleteFirst() {
		if(tail.next == null)
			return;
		else if(tail.next == tail)
			tail.next = tail = null;
		else {
			tail.next = tail.next.next;
		}
	}
	
	public void deleteLast() {
		if(tail.next == null)
			return;
		else if(tail.next== tail)
			tail.next = tail = null;
		else {
			Node trav = tail.next;
			while(trav.next != tail)
				trav = trav.next;
			trav.next = tail.next;
			tail = trav;
		}
	}
	
		
	public void display() {
		if(tail == null)
			return;
		Node trav = tail.next;
		System.out.print("List : ");
		do{
			System.out.print(" " + trav.data);
			trav = trav.next;
		}while(trav != tail.next) ;
		System.out.println("");
	}
	public static void main(String[] args) {
		
		singlycircusingtailonly list=new singlycircusingtailonly();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);

		list.addLast(50);
		list.addLast(60);
		
		list.deleteFirst();
		list.deleteLast();
		list.display();		
		
	}
	
	
	
	
	
	
	
}













