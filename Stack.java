import java.util.Scanner;
public class StackDemo
{
    int ar[];
    int top;
    StackDemo()
    {
        ar = new int[5];
        top=-1;
    }
    void push()
    {
        if(top==ar.length-1)
        {
            System.out.println("Stack full/ over flow");
        }
        else
        {
            System.out.println("Enter Data ");
            Scanner sc2 = new Scanner(System.in);
            int data =sc2.nextInt();
            
            top= top+1;
            ar[top] =data;
            System.out.println("data inserted......");
        }
        
    }
    void pop()
    {
      if(top==-1)
      {
          System.out.println("stack empty/ underflow");
      }
      else
      {
          System.out.println("deleted....."+ar[top]);
          top =top-1;
      }
        
    }
    void display()
    {
        if(top ==-1)
        {
            System.out.println("stack is empty/underflow");
        }
        else
        {
            System.out.println("----stack element's-----");
            for(int i=top; i>=0; i--)
            {
                System.out.println(ar[i]);
            }
        }
    }
    public static void main(String arg[])
    {
        StackDemo obj = new StackDemo();
        
        while(true)
        {
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for display");
            System.out.println("Press 4 for exit");
            
            System.out.println("Enter your choice");
            Scanner sc1 = new Scanner(System.in);
            int choice =sc1.nextInt();
            
            switch(choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
                
        }
    }
}
