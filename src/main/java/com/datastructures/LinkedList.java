package com.datastructures;

/**
 * Created by Krishna on 2/20/2019.
 */
// A simple Java program for traversal of a linked list
class LinkedList
{
    Node head; // head of list

    /* Linked list Node. This inner class is made static so that
    main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next=null; } // Constructor
    }

    /* This function prints contents of linked list starting from head */
    public void printList()
    {
        Node n = head;
        while (n != null && n.next!= null)
        {
            System.out.print(n.data+" "+n.next.data+" \n");
            n = n.next;
        }
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args)
    {
		/* Start with the empty list. */
        LinkedList llist = new LinkedList();

        llist.head	 = new Node(1);
        Node second	 = new Node(2);
        Node third	 = new Node(3);
        Node four	 = new Node(5);

        llist.head.next = third; // Link first node with the second node
        third.next =second ;
        second.next =four;
        four.next = llist.head;// Link first node with the second node

        llist.printList();
    }
}
