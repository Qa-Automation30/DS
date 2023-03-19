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
        /**
         * Prepend the new node in the List
         */
        ll.prependNode(11);
        ll.printList();
        System.out.println("length of the Linked list->"+ll.length);
        /**
         * Remove from first
         */
        System.out.println("=======================");
       Node node = ll.removeFromFirst();
       System.out.println(node.value);
        System.out.println(ll.length);
        ll.printList();

        /**
         * Remove last from the LL
         */
        System.out.println("______________________");
        Node lastNode = ll.removeLast();
        System.out.println(lastNode.value);
        System.out.println(ll.length);
        ll.printList();
        /**
         * get the value from any node via it's index
         */
        System.out.println("''''''''''''''''''''''''");
        Node nodeIndex = ll.getValueViaIndex(1);
        System.out.println(nodeIndex.value);
        /**
         * Set the value in LL via it's index value
         */
        System.out.println("+++++++++++++++++");
        ll.setTheValueViaIndex(2,99);
        ll.printList();
        ll.printList();


    }
}
