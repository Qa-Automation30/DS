package LinkedListDataStructure.practice;

public class MainClass {
    public static void main(String [] args)
    {
        LinkedList ll = new LinkedList(4);
        ll.appendNewNodeInLinkedList(5);
        ll.appendNewNodeInLinkedList(6);
        ll.appendNewNodeInLinkedList(7);
        ll.printLinkedListValues();
        System.out.println("================");
        ll.removeLastValueFormList();
        ll.printLinkedListValues();
        System.out.println("================");
        ll.prependTheNode(10);
        ll.prependTheNode(11);
        ll.printLinkedListValues();
        System.out.println("================");
        ll.removeFirstElementFromList();
        ll.printLinkedListValues();
        System.out.println("================");
        System.out.println(ll.getValue(2));

    }
}
