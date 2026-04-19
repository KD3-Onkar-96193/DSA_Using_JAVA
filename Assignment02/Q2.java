package assi2;
import java.util.Scanner;

public class EmployeeLL{
	static class Node{
		private Node next;
		private Node prev;
		private int empid;
		private int sal;
		private String ename;

		public Node(int empid, String ename, int sal) {
			this.empid=empid;
			this.ename=ename;
			this.sal=sal;
		}
	}
	
	private Node head;
	Scanner sc = new Scanner(System.in);
	
	public EmployeeLL() {
		head = null;
	}

	public void addFirst(int empid,String ename,int sal){
		Node newnode = new Node(empid,ename,sal);
		if(head == null) {
			head = newnode;
			newnode.next = newnode.prev = newnode;
		}
		else {
			newnode.next = head;
			newnode.prev = head.prev;
			head.prev.next = newnode;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void addEmployee() {
		System.out.print("Enter empid: ");
		int id = sc.nextInt();

		System.out.print("Enter name: ");
		String name = sc.next();

		System.out.print("Enter salary: ");
		int sal = sc.nextInt();

		addFirst(id, name, sal);
	}
	
	public void addAtPos() {
		System.out.print("Enter position: ");
		int pos = sc.nextInt();

		System.out.print("Enter empid: ");
		int id = sc.nextInt();

		System.out.print("Enter name: ");
		String name = sc.next();

		System.out.print("Enter salary: ");
		int sal = sc.nextInt();

		Node newnode = new Node(id, name, sal);

		Node trav = head;

		for(int i = 1; i < pos - 1; i++)
			trav = trav.next;

		newnode.next = trav.next;
		newnode.prev = trav;
		trav.next.prev = newnode;
		trav.next = newnode;
	}
	
	public void fDisplay() {
		if(head  == null) {
			System.out.println("List is empty");
			return;
		}
		Node trav = head;
		System.out.print("Forward List : ");
		do {
			System.out.print(" " + trav.empid+" "+trav.ename+" "+trav.sal);
			trav = trav.next;
		}while(trav != head);
		System.out.println("");
	}
	
	public void bDisplay() {
		if(head  == null) {
			System.out.println("List is empty");
			return;
		}
		Node trav = head.prev;
		System.out.print("Backward List : ");
		do {
			System.out.print(" " + trav.empid+" "+trav.ename+" "+trav.sal);
			trav = trav.prev;
		}while(trav != head.prev);
		System.out.println("");
	}

	public void searchbyname() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.print("Give name=");
		String name=sc.next();

		Node trav=head;
		do{
			if(trav.ename.equalsIgnoreCase(name)) {
				System.out.println(trav.empid+" "+trav.ename+" "+trav.sal);
				return;
			}
			trav=trav.next;
		}while(trav!=head);

		System.out.println("Employee not found");
	}

	public void deletebyEmpid() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.print("Give empid=");
		int empidd=sc.nextInt();

		Node trav=head;
		do{
			if(trav.empid==empidd) {
				if(trav.next==trav) {
					head=null;
				}
				else {
					trav.prev.next = trav.next;
					trav.next.prev = trav.prev;
					if(trav==head)
						head=head.next;
				}
				System.out.println("Deleted");
				return;
			}
			trav=trav.next;
		}while(trav!=head);

		System.out.println("Employee not found");
	}

	public void updateSal() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.print("Give empid=");
		int empidd=sc.nextInt();

		System.out.print("Amt to update=");
		int amt=sc.nextInt();

		Node trav=head;
		do {
			if(trav.empid==empidd) {
				trav.sal=amt;
				System.out.println("Updated");
				return;
			}
			trav=trav.next;
		}while(trav!=head);

		System.out.println("Employee not found");
	}

	public void sortBySal() {
		if(head==null)
			return;

		Node i=head;
		do {
			Node j=i.next;
			while(j!=head) {
				if(i.sal>j.sal) {
					int tempid=i.empid;
					String tempname=i.ename;
					int tempsal=i.sal;
					 
					i.empid=j.empid;
					i.ename=j.ename;
					i.sal=j.sal;
						 
					j.empid=tempid;
					j.ename=tempname;
					j.sal=tempsal;	 
				}
				j=j.next; 
			}
			i=i.next; 
		}while(i!=head);	

		System.out.println("Sorted");
	}

	// MENU
	public static void main(String[] args) {
		EmployeeLL list=new EmployeeLL();
		Scanner sc=new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n1.Add Employee");
			System.out.println("2.Display Forward");
			System.out.println("3.Display Backward");
			System.out.println("4.Search by Name");
			System.out.println("5.Delete by Empid");
			System.out.println("6.Update Salary");
			System.out.println("7.Sort by Salary");
			System.out.println("8.Add at Position");
			System.out.println("0.Exit");
			System.out.print("Enter choice: ");

			choice=sc.nextInt();

			switch(choice) {
			case 1:
				list.addEmployee();
				break;
			case 2:
				list.fDisplay();
				break;
			case 3:
				list.bDisplay();
				break;
			case 4:
				list.searchbyname();
				break;
			case 5:
				list.deletebyEmpid();
				break;
			case 6:
				list.updateSal();
				break;
			case 7:
				list.sortBySal();
				break;
			case 8:
				list.addAtPos();
				break;
			case 0:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid choice");
			}
		}while(choice!=0);
	}
}