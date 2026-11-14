
import java.util.Scanner;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}

public class week12q1hw {

    static Node build(String[] stops) {
        Node head = new Node(stops[0]);
        Node temp = head;

        for (int i = 1; i < stops.length; i++) {
            temp.next = new Node(stops[i]);
            temp = temp.next;
        }

        return head;
    }

    static void printRoute(Node head) {
        Node temp = head;
        int count = 0;
        String first = head.data;
        String last = "";

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            last = temp.data;
            count++;
            temp = temp.next;
        }

        System.out.println("null");

        System.out.println("Stops: " + count +
                ", First: " + first +
                ", Last: " + last);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String stops[] = new String[n];

        for (int i = 0; i < n; i++) {
            stops[i] = sc.next();
        }

        Node head = build(stops);

        printRoute(head);
    }
}
