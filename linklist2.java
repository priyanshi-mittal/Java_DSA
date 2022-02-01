class Node2{
    int data;
    Node2 next;
    Node2(int data){
        this.data = data;
        this.next=null;   
    }
}
public class Main2 {
    Node2 head;
    public void insertAtBeg(int x){
        Node2 n = new Node2(x);
        if(head==null){
            head =n;
        }
        else{
            n.next = head;
            head = n;
        }
    }
    public void print(){
        Node2 temp =head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public int count(){
        Node2 temp = head;
        int c =0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public void insertAtPos(int x, int pos){
        Node2 n = new Node2(x);
        if(head==null){
            if(pos!=1)
              System.out.println("Invalid Position");
            else 
                head =n;
        }
        else{
            if(pos>count()+1)
                System.out.println("Invalid position");
            else{
                Node2 temp = head;
                int c = 1;
                while(temp!=null){
                    if(pos-1 ==c){
                        break;
                    }
                    c++;
                    temp = temp.next;
                }
                n.next = temp.next;
                temp.next = n;
            }
        }
    }
    public static void main(String args[]){
        Main2 obj =new Main2();
        obj.insertAtBeg(10);
        obj.insertAtBeg(20);
        obj.insertAtBeg(30);
        obj.insertAtPos(40,1);
    }
}