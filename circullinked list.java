class Node{
    int data;
    Node next;
}
public class Main {
    Node head;
    public void cinserAtBeg(int x){
        Node n = new Node();
        n.data = x;
        if(head==null){
            head=n;
            n.next = n;
        }
        else{
            Node temp= head;
            while(temp.next!=head){
                temp = temp.next;
            }
            n.next = head;
            temp.next= n;
            head = n;
        }
    }
    public void cinserAtEnd(int x){
        Node n = new Node();
        n.data = x;
        if(head==null){
            head=n;
            n.next=n;
        }
        Node temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next=n;
        n.next=head;
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.cinserAtEnd(10);
        obj.cinserAtEnd(20);
        obj.cinserAtEnd(30);
    }
    
}