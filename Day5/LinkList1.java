public class LinkList1 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    // Add at Head
    static Node addAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    // Add at Tail
    static Node addAtTail(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    // Add at Position (1-based indexing)
    static Node addAtPos(Node head, int val, int pos) {

        if (pos == 1) {
            return addAtHead(head, val);
        }

        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Delete at Head
    static Node deleteAtHead(Node head) {

        if (head == null) {
            return null;
        }

        return head.next;
    }

    // Delete at Tail
    static Node deleteAtTail(Node head) {

        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    // Delete at Position (1-based indexing)
    static Node deleteAtPos(Node head, int pos) {

        if (head == null) {
            return null;
        }

        if (pos == 1) {
            return head.next;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Invalid Position");
            return head;
        }

        temp.next = temp.next.next;
        return head;
    }

    // Delete Node with Given Data
    static Node deleteWithData(Node head, int key) {

        if (head == null) {
            return null;
        }

        if (head.data == key) {
            return head.next;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    // Update Value at Position
    static Node updateAtPos(Node head, int pos, int newValue) {

        if (head == null) {
            return null;
        }

        Node temp = head;

        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return head;
        }

        temp.data = newValue;
        return head;
    }

    // Print List
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
    
    static Node  findMiddle(Node head){
        if(head==null){
            return null;
        }
        Node turtle=head;
        Node rabbit = head;
        while(rabbit.next!=null && rabbit.next.next!=null){
            turtle=turtle.next;
            rabbit=rabbit.next.next;

        }
        return turtle;
    }
    static boolean detectCycle(Node head) {

    if (head == null) {
        return false;
    }

    Node turtle = head; // slow pointer
    Node rabbit = head; // fast pointer

     while (rabbit != null && rabbit.next != null )
    {

        turtle = turtle.next;

        rabbit = rabbit.next.next;

        if (turtle == rabbit) {
            return true;
        }
    }

    return false;
}
    static Node startOfCycle(Node head){
        if(head == null){
            return null;

        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    static Node reverse(Node head){
        if(head==null){
            return null;
        }
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    
    public static void main(String[] args) {

        Node head1=new Node(10);
        head1.next=new Node(20);
        head1.next.next=new Node(30);
        head1.next.next.next=new Node(40);
        head1.next.next.next.next=head1.next.next;
        System.out.println(detectCycle(head1));
        System.out.println(startOfCycle(head1).data);
        // Node head = null;

        // head = addAtHead(head, 10);
        // head = addAtTail(head, 20);
        // head = addAtTail(head, 30);
        // head = addAtTail(head, 40);
        // head = addAtTail(head, 50);
        

        // System.out.println("Original List:");
        // printList(head);

        // head = addAtPos(head, 25, 3);
        // System.out.println("\nAfter Adding 25 at Position 3:");
        // printList(head);

        // head = deleteAtHead(head);
        // System.out.println("\nAfter Deleting Head:");
        // printList(head);

        // head = deleteAtTail(head);
        // System.out.println("\nAfter Deleting Tail:");
        // printList(head);

        // head = deleteAtPos(head, 3);
        // System.out.println("\nAfter Deleting Position 3:");
        // printList(head);

        // head = deleteWithData(head, 25);
        // System.out.println("\nAfter Deleting Data 25:");
        // printList(head);

        // head = updateAtPos(head, 2, 80);
        // System.out.println("\nAfter Updating Position 2 to 99:");
        // printList(head);


        // Node middle = findMiddle(head);
        

        
        // System.out.println("Middle Element = " + middle.data);


        // System.out.println(detectCycle(head));
        
    }
}