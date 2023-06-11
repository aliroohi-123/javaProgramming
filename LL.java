import javax.xml.transform.Source;

class Llist {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void addNodeFront(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void add_last(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
    }

    public void delete_first() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void delete_last() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void printNodes() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    Node midpoint() {
        Node fast = head;
        Node slow = head;
        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node reverse() {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

}

public class LL {
    public static void main(String[] args) {
        Llist l1 = new Llist();
        // l1.addNodeFront(3);
        // l1.addNodeFront(8);
        // l1.addNodeFront(2);
        // l1.delete_last();
        // l1.delete_first();
        l1.add_last(2);
        l1.add_last(21);
        l1.add_last(22);
        l1.add_last(3);

        l1.printNodes();
        // Node mid =l1.midpoint();
        // System.out.println(" " +l1.midpoint().data);

        // System.out.println(l1.reverse().data);
    }
}
