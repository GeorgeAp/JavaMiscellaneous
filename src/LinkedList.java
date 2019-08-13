public class LinkedList {

    Node head; // head of list

    /* Linked list Node.  This inner class is made static so that
       main() can access it */
    static class Node{
        int data;
        Node next;

        // Constructor
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){

        // create an empty list
        LinkedList list1 = new LinkedList();

        list1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(5);

                /* Three nodes have been allocated dynamically.
          We have references to these three blocks as first,
          second and third

          llist.head        second              third
             |                |                  |
             |                |                  |
         +----+------+     +----+------+     +----+------+
         | 1  | null |     | 2  | null |     |  3 | null |
         +----+------+     +----+------+     +----+------+ */

         list1.head.next = second;
         /*  Now next of the first Node refers to the second.  So they
            both are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  | null |     |  3 | null |
        +----+------+     +----+------+     +----+------+ */

         second.next = third;
         /*  Now next of the second Node refers to third.  So all three
            nodes are linked.

         llist.head        second              third
            |                |                  |
            |                |                  |
        +----+------+     +----+------+     +----+------+
        | 1  |  o-------->| 2  |  o-------->|  3 | null |
        +----+------+     +----+------+     +----+------+ */

         third.next = fourth;

         list1.printList();
    }

    // We use this print to traverse the list
    public void printList(){
        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
