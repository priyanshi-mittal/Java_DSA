import java.util.Scanner;
public class Swap 
{
    Swap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter I value");
        int container1 =  sc.nextInt();
        
        System.out.println("Enter II value");
        int container2 = sc.nextInt();
        
        System.out.println("Value of container1 ="+container1);
        System.out.println("Value of container2 ="+container2);
        
        //Swapping
        
        int temp = container1;
        container1 = container2;
        container2 = temp;
        
        System.out.println("\n......after swapping.....\n");
        System.out.println("Value of container1 ="+container1);
        System.out.println("Value of container2 ="+container2);
    }
    public static void main(String args[])
    {
        Swap obj = new Swap();
    }
}