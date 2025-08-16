// merge unique lists in java

import java.util.HashSet;
import java.util.Set;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

}

class MyLinkedList {
    private Node head;

    public void addNode(int val) {
        if (head == null) {
            head = new Node(val);
            return ;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(val);
    }

    public void deleteNode(int val) {
        if (head == null) {
            System.out.println("List is already empty.");
            return ;
        }

        if (head.val == val) {
            head = head.next;
            return;
        }

        Node prevNode = head;
        Node currentNode = head.next;

        while (currentNode != null){
            if (currentNode.val == val) {
                prevNode.next = currentNode.next;
                System.out.println("Element deleted successfully.");
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print("[" + currentNode.val + "]" + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public static void mergeUnique(MyLinkedList l1, MyLinkedList l2) {
        Set<Integer> uniqueSet = new HashSet<>();

        Node head1 = l1.head;
        Node head2 = l2.head;

        while (head1 != null) {
            uniqueSet.add(head1.val);
            head1 = head1.next;
        }

        while (head2 != null) {
            uniqueSet.add(head2.val);
            head2 = head2.next;
        }

        MyLinkedList mergedList = new MyLinkedList();
        for (int val : uniqueSet) {
            mergedList.addNode(val);
        }

        mergedList.printList();
    }
}

public class mergeUniqueLists {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedList2 = new MyLinkedList();
//        myLinkedList.printList();

        myLinkedList.addNode(20);
        myLinkedList.addNode(50);
        myLinkedList.addNode(30);
        myLinkedList.addNode(40);
        myLinkedList.addNode(60);
        myLinkedList.addNode(10);
        myLinkedList.printList();

        myLinkedList2.addNode(10);
        myLinkedList2.addNode(50);
        myLinkedList2.addNode(3);
        myLinkedList2.addNode(6);
        myLinkedList2.addNode(40);
        myLinkedList2.addNode(20);
        myLinkedList2.printList();

        MyLinkedList.mergeUnique(myLinkedList,myLinkedList2);


    }
}