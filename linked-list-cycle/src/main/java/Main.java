import java.util.HashSet;
import java.util.Set;

public class Main {

//    TODO https://leetcode.com/problems/linked-list-cycle/

    public static void main(String[] args) {

        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;

        System.out.println(hasCycle(firstNode));
    }

    public static boolean hasCycle(Node head) {
        boolean hasCycle = false;
        Set<Node> nodesSeen = new HashSet<>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                hasCycle = true;
                break;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return hasCycle;
    }
}