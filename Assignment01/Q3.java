class InsertSortedList{

    static class Node{
        private int data;
        private Node next;

        public Node(int value){
            data=value;
            next=null;
        }
    }

    private Node head;

    public InsertSortedList() {
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

	public void addBySorted(int a){
	Node node=new Node(a);
	if(head == null || a < head.data) {
	    node.next = head;
	    head = node;
	    return;
	}

	Node trav = head;

	while(trav.next != null && trav.next.data < a) {
	    trav = trav.next;
	}
	node.next = trav.next;
	trav.next = node;
	
}
	
    public void display() {
		Node trav = head;

		System.out.print("List: ");
		while (trav != null) {
			System.out.print(trav.data+"->");
			trav = trav.next;
		}

		System.out.println("");
	}
}

public class Q3 {
    public static void main(String[] args) {
        InsertSortedList obj=new InsertSortedList();

        obj.addFirst(40);
        obj.addFirst(30);
        obj.addFirst(20);
        obj.addFirst(10);

        obj.addBySorted(25);
        obj.display();
     
    }
    
}
