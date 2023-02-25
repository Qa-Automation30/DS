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

    /**
     * This method is removing an element from the last of LL
     * @return
     */
    Node removeLast()
    {
        if(length==0){
            return null;
        }
      Node temp1;
      Node temp2;
      temp1=head;
      temp2=head;
      for(int i=0;i<length-1;i++)
      {
          temp1=temp1.next;
          if(temp1.next!=null)
          {
              temp2=temp1;
          }
      }
      tail=temp2;
      tail.next=null;
      length--;
      if(length==0)
      {
          head=null;
          tail=null;
      }
      return temp1;
    }

    /**
     * This method is removing an element from the beginning of LL
     * @return
     */
    Node removeFromFirst()
    {
        if(length==0){return null;
        }
        Node temp;
        temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0)
        {
            tail=null;
        }
        return temp;
    }
   Node getValueViaIndex(int index)
    {
        Node temp=head;
        if(index<0 ||index>length)
        {
            return null;
        }
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    int setTheValueViaIndex(int index,int value)
    {   Node temp=head;
        if(index<0||index>length)
        {
            return -1;
        }
        for (int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        temp.value=value;
        return temp.value;
    }
    boolean insertNodeAtPosition(int index)
    {
        return false;
    }
}
