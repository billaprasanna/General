
public class LinkedListWithNode {

    Node head;

    public static void main(String[] args) {
        LinkedListWithNode linkedListWithNode = new LinkedListWithNode();
         linkedListWithNode = insertNode(linkedListWithNode, 5);
        linkedListWithNode = insertNode(linkedListWithNode, 20);
        linkedListWithNode = insertNode(linkedListWithNode, 15);
        linkedListWithNode = insertNode(linkedListWithNode, 13);
        linkedListWithNode = insertAtSpecificPosition(linkedListWithNode, 4, 45);
        linkedListWithNode = deleteNodeAtSpecificPosition(linkedListWithNode, 2);
        printList(linkedListWithNode);
        linkedListWithNode = deleteElement(linkedListWithNode, 15);
        System.out.println();
        printList(linkedListWithNode);
        printFibonacci(10);
        reverseNumber(155345);

    }

       static class Node{
        int data;
        Node next;

        Node(int intData){
            data = intData;
            next = null;
        }
    }

    public static LinkedListWithNode insertNode(LinkedListWithNode linkedListWithNode, int data){
        Node newNode = new Node(data);
        newNode.next = null;
        if(linkedListWithNode.head==null){
            linkedListWithNode.head = newNode;
        }

        else {
            Node last = linkedListWithNode.head;
            while (last.next!=null ){
                last = last.next;
            }
            last.next = newNode;
        }
        return linkedListWithNode;
    }

    public static LinkedListWithNode deleteElement(LinkedListWithNode list, int key){
        Node currentNode = list.head;
        Node prev = null;

        if(currentNode.data==key){
            list.head = currentNode.next;
            return list;
        }
       while (currentNode!=null && currentNode.data!=key){
           prev = currentNode;
           currentNode = currentNode.next;
       }
       if(currentNode!=null){
           prev.next = currentNode.next;
       }
       if(currentNode==null){
           System.out.println(key +" Not found");
       }
        return list;
    }

    public static void printList(LinkedListWithNode list){
        Node currentNode = list.head;
        System.out.print("values are  ");
        while(currentNode!=null){
            System.out.print(" "+currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void printFibonacci(int n){
        System.out.println();
        int first =1 ;
        int second =1;
        for(int i=1;i<=n;i++){
            int c = first+ second;
            first = second;
            second = c;
            System.out.print(c+" ");
        }
    }

    public static int reverseNumber(int number){
        int reverse_Sum = 0;
        while(number>0){
            int remainder = number%10;
            reverse_Sum = reverse_Sum*10+remainder;
            number = number/10;
        }
        System.out.println(reverse_Sum);
        return reverse_Sum;
    }

    public static LinkedListWithNode insertAtSpecificPosition(LinkedListWithNode list, int position, int key){

        if(list==null){
            return list;
        }
        Node currentNode = list.head;
        Node prev  = null;
        int count  = 0;
        Node node = new Node(key);
        if(position==1){
            list.head = node;
           node.next =currentNode;
            return list;
        }
        while(currentNode!=null){
            count = count+1;
            currentNode = currentNode.next;

        }
        if(count<position){
            System.out.println("out of range");
            return list;
        }
        currentNode = list.head;
        for(int i=1;i<position;i++){
            if(currentNode!=null) {
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }
        prev.next = node;
        node.next = currentNode;
        return list;
    }

    public static LinkedListWithNode deleteNodeAtSpecificPosition(LinkedListWithNode list, int position ){
        if(list==null){
            return list;
        }
        Node currentNode = list.head;
        Node prev  = null;
        int count  = 0;
        if(position==1){
            list.head = currentNode.next;
            return list;
        }

        while(currentNode!=null){
            count = count+1;
            currentNode = currentNode.next;

        }
        if(count<position){
            System.out.println("out of range");
            return list;
        }
        currentNode = list.head;

        currentNode = list.head;
        for(int i=1;i<position;i++){
            if(currentNode!=null) {
                prev = currentNode;
                currentNode = currentNode.next;
            }
        }
        prev.next =  currentNode.next;
        return list;
    }
}
