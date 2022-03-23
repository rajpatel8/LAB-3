 class LinkedList {
     Node head; 
     static class Node {
         int data;
         Node next;
         Node(int d)
         {
             data = d;
             next = null;
         }
     }
     public static LinkedList insertLast(LinkedList list, int data)
     {
         Node new_node = new Node(data);
         new_node.next = null;
 
         if (list.head == null) {
             list.head = new_node;
         }  
         else {
             Node last = list.head;
             while (last.next != null) {
                 last = last.next;
             }
             last.next = new_node;
         }
 
         return list;
     }
     
     public void insertAfter(Node prev_node, int new_data)
    {
    if (prev_node == null) {
        System.out.println(
            "The given previous node cannot be null");
        return;
    } 
    Node new_node = new Node(new_data);
 
    new_node.next = prev_node.next;
 
    prev_node.next = new_node;
    }
     public static Boolean isEmpty(LinkedList list){
        if (list.head==null) {
            return true ;
        }
        else{
            return false;}
     }
     public static void printList(LinkedList list)
     {
         Node currNode = list.head;
     
         System.out.print("LinkedList: ");
     
         while (currNode != null) {
             System.out.print(currNode.data + " ");

             currNode = currNode.next;
         }
     }
     public void push(int new_data)
    {
        Node new_node = new Node(new_data);
 
        new_node.next = head;
 
        head = new_node;
    }
     static Node removeLastNode(Node head)
    {
        if (head == null)
            return null;
 
        if (head.next == null) {
            return null;
        }
 
        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;
 
        second_last.next = null;
 
        return head;
    }
    public int getLast() throws Exception
    {
        // Throws an Exception if the List is empty
        if (head == null) {
            throw new Exception(
                "No elements found in Linked List");
        }
 
        Node temp = head;
 
        while (temp.next != null) {
            temp = temp.next;
        }
 
        return temp.data;
    }

     public void sortList()
    {
 
        Node current = head, index = null;
 
        int temp;
 
        if (head == null) {
            return;
        }
        else {
            while (current != null) {
                index = current.next; 
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
     public static void main(String[] args) throws Exception
     {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list = insertLast(list, i) ;
        }
        printList(list);   
        
        if (isEmpty(list)==true) {
            System.out.print("\nList is empty\n");
        }
        else{
            System.out.print("\nList is not empty\n");
        }
        int i =10;  
        list.sortList();
        while ( i  > 0) {
            removeLastNode(list.head);
            printList(list);
            System.out.print("\n");
            i--;
        }         
        int a = list.getLast();
        System.out.println("Last element is " + a);
     }  
 }
