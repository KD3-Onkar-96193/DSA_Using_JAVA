
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Q1 {

    public static int findLevel(Node root, int target) {
        int level = 0;

        while (root != null) {
            if (root.data == target) {
                return level;
            } else if (target < root.data) {
                root = root.left;
            } else {
                root = root.right;
            }
            level++;
        }

        return -1; 
    }

    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(18);

        int target = 7;

        int level = findLevel(root, target);

        if (level != -1) {
            System.out.println("Node " + target + " is at level: " + level);
        } else {
            System.out.println("Node not found in BST");
        }
    }
}
