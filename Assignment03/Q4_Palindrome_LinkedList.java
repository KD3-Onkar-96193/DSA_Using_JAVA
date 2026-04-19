public class Q4_Palindrome_LinkedList
{
      static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode current=slow.next;
        slow.next=null;

        ListNode prev=null;
        while(current!=null){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }

        while(prev!=null){
            if(prev.val!=head.val){
                return false;
            }
            prev=prev.next;
            head=head.next;

        }
        return true;
    }

     public static void main(String[] args) {

        Q4_Palindrome_LinkedList obj = new Q4_Palindrome_LinkedList();

      
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean result = obj.isPalindrome(head);

        if (result) {
            System.out.println("Linked List is a Palindrome");
        } else {
            System.out.println("Linked List is NOT a Palindrome");
        }
    }


}