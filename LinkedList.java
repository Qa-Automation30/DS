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

    /**
     * This method is appending a node in linked list [In last of the Linked List]
     * So, if we want to append a new node in list, need to pass a value first
     * and need to create an object of a Node class to create a new node
     */
    void appendNode(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    /**
     * In this method printing all the records of Linked list
     */
    void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println("Printing list values->"+temp.value);
            temp = temp.next;
        }
    }

    /**
     * This method is adding the node in the beginning of the Linked List
     * so here we need to create a new node first
     */
    void prependNode(int value)
    {
        Node temp;
        Node newNode = new Node(11);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            temp=head;
            head = newNode;
            head.next=temp;
        }
        length++;
    }
}
