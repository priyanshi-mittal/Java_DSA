class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Main{
    Node head;
    public static void main(String[] args){
        Main o = new Main();
        Node obj = new Node(10);
        o.head = obj;
        Node obj1 = new Node(20);
        o.head.next = obj1;
        Node obj2 = new Node(30);
        o.head.next.next = obj2;
        Node obj3 = new Node(40);
        o.head.next.next.next = obj3;
        
    }
}
