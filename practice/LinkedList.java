package LinkedListDataStructure.practice;

public class LinkedList {
    Node head;
    Node tail;
    int length;
    LinkedList(int value)
    {
        Node newNode = new Node(value);
        head =newNode;
        tail=newNode;
        length++;
    }
    //Print the linked list
    void printLinkedListValues()
    {
        Node temp = head;
        while (temp!=null)
        {
            System.out.println("linked list values-->"+temp.value);
            temp=temp.next;
        }
    }
    //append a new node
    int appendNewNodeInLinkedList(int value)
    {

        Node newNode = new Node(value);
        if(length==0)
        {
            head =newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
        return tail.value;
    }
    //remove last value form a list
    Node removeLastValueFormList()
    {
        Node temp1=head;
        Node temp2=head;
        if(length==0)
        {
            return null;
        }
       for(int i=0;i<length-1;i++)
       {
        temp1 =temp1.next;
        if(temp1.next!=null)
        {
            temp2=temp1;
        }
       }
        tail=temp2;
        temp2.next=null;
        length--;
       if(length==0)
       {
           head=null;
           tail=null;
       }
        return temp1;
    }
    //prepend the node
    Node prependTheNode(int value)
    {
        Node newNode = new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
            length++;
        }
        newNode.next=head;
        head=newNode;
        length++;
        return head;
    }
    //removeFirst from the list
    Node removeFirstElementFromList()
    {
        Node temp=head;
        if(length==0){
            return null;
        }
        head=head.next;
        temp.next=null;
        length--;
        return temp;
    }
    //getTheValueOfLinkList
    int getValue(int index)
    {
        Node temp=head;
        if(index<0 || index>length)
        {
            return 0;
        }
        for(int i=0;i<=index-1;i++)
        {
            temp=temp.next;
        }
        return temp.value;
    }
}
