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
    /* 1. Check if the given Node is null */
    if (prev_node == null) {
        System.out.println(
            "The given previous node cannot be null");
        return;
    }
 
    Node new_node = new Node(new_data);
 
    new_node.next = prev_node.next;
 
    /* 5. make next of prev_node as new_node */
    prev_node.next = new_node;
    }

     public static int isEmpty(LinkedList list){
        if (list.head==null) {
            return 1 ;
        }
        else{
            return 0;}
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
     public static void insertFirst(){

     }
     public static void main(String[] args)
     {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list = insertLast(list, i) ;
        }
        int x = isEmpty(list) ;
        if (x==1) {
            System.out.print("List is empty\n") ;
        }
        else{
            System.out.print("List is not empty\n");
        }
         printList(list);   
     }  
 }

 