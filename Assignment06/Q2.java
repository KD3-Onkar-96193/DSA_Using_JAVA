
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Q2 {

    
    public static Node findSuccessor(Node root, Node target) {
        Node successor = null;

        while (root != null) {
            if (target.data < root.data) {
                successor = root;   // possible successor
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return successor;
    }

    public static Node findNode(Node root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return findNode(root.left, key);
        } else {
            return findNode(root.right, key);
        }
    }

   
    public static Node findMin(Node node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

   
    public static Node inorderSuccessor(Node root, Node target) {
        if (target == null) return null;

     
        if (target.right != null) {
            return findMin(target.right);
        }

       
        return findSuccessor(root, target);
    }

    public static void main(String[] args) {

        
        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(15);
        root.right.left = new Node(25);
        root.right.right = new Node(35);

        int key = 15;

        Node target = findNode(root, key);
        Node successor = inorderSuccessor(root, target);

        if (successor != null) {
            System.out.println("Inorder successor of " + key + " is: " + successor.data);
        } else {
            System.out.println("No inorder successor exists");
        }
    }
}

