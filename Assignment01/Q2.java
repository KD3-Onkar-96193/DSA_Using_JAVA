
class SinglyLinearLinkedList{

    static class Node{
        private int data;
        private Node next;

        public Node(int value){
            data=value;
            next=null;
        }
    }

    private Node head;

    public SinglyLinearLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

    public void addFirst(int value) {

		Node newnode = new Node(value);

		newnode.next = head;

		head = newnode;
	}

	// a is newvalue and value is alredy exists in list 
  public void addBeforevalue(int a,int value) {
	Node node=new Node(a);
	Node trav=head;
	if(head==null) {
		
	}
	else if(head.data == value) {
		node.next=head;
		head=node;
		
	}
	else {
		while(trav.next != null) {
			if(trav.next.data== value){
				break;
			}
			trav=trav.next;
		}
		node.next=trav.next;
		trav.next=node;
	}
	
}

public void addAftervalue(int a,int value) {
	Node node=new Node(a);
	Node trav=head;
	if(head==null) {
		
	}
	else {
		while(trav.next != null) {
			if(trav.data== value){
				break;
			}
			trav=trav.next;
		}
		node.next=trav.next;
		trav.next=node;
	}
	
}
	
    public void display() {
		Node trav = head;

		System.out.print("List: ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}

		System.out.println("");
	}


}


public class Q2{

public static void main(String[] args) {

		SinglyLinearLinkedList list = new SinglyLinearLinkedList();

		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);

		list.addAftervalue(50, 40);

		list.addBeforevalue(60, 40);
		
	
		list.display();

	}
} 