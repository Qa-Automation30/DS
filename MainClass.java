package LinkedListDataStructure;

public class MainClass {
    public static void main(String[] args)
    {
        /**
         * Create a LinkedList and pass the value in it and Print the all values
         */
        LinkedList ll = new LinkedList(1);
        System.out.println("head value->"+ll.head.value);
        System.out.println("tail value->"+ll.tail.value);
        System.out.println("length of the Linked list->"+ll.length);
        /**
         * Append a newNode into LinkedList
         */
        ll.appendNode(2);
        ll.appendNode(3);
        ll.appendNode(4);
        ll.appendNode(5);
        System.out.println("head value->"+ll.head.value);
        System.out.println("tail value->"+ll.tail.value);
        System.out.println("length of the Linked list->"+ll.length);
        /**
         * Print all the values from the LinkedList
         */
        ll.printList();

    }
}
