package LinkedListDataStructure;

public class LinkedList {
    /**
     * what is Linked list ?
     * Ans-> Linked list basically having a couple of nodes.
     * LL having head, tail and length
     */
    Node head;
    Node tail;
    int length;
    LinkedList(int value)
    {
        /**
         * In the constructor of LL, we need to create Node basically, so creating the object of Node class
         */
        Node newNode = new Node(value);
        /**
         * So after creating a node, need to assign that node in head and tail variable.
         */
        head = newNode;
        tail = newNode;
        length++;
    }
}
