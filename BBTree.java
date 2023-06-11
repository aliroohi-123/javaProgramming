import java.util.*;

public class BBTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "  ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "  ");
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data + "  ");
    }

    // NO. OF NODES
    public static int numOfNodes(Node root) {
        if (root == null) {
            return 0;

        }

        int sum1 = numOfNodes(root.left);
        int sum2 = numOfNodes(root.right);
        return sum1 + sum2 + 1;

    }

    // SUM OF NODES
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int sum1 = sumOfNodes(root.left);
        int sum2 = sumOfNodes(root.right);
        return sum1 + sum2 + root.data;
    }

    // HEIGHT OF TREE
    public static int maxHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int m1 = maxHeight(root.left);
        int m2 = maxHeight(root.right);
        int m = Math.max(m1, m2) + 1;
        return m;
    }
    // DIAMETER OF A TREE
    public  static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int dia1 =diameter(root.left);
        int dia2 =diameter(root.right);
        int dia3 = maxHeight(root.left) +maxHeight(root.right)+1;
        return Math.max(dia3,Math.max(dia1,dia2));
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        // postorder(root);
        // inorder(root);
        // int s =numOfNodes(root);
        // int s =sumOfNodes(root);
        //int s = maxHeight(root);
        int s =diameter(root);
        System.out.println(s);
    }
}