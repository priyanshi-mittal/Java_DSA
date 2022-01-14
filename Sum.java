import java.util.Scanner;
public class Sum 
{
    void func()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter I value");
        int var1 = sc.nextInt();
        
        System.out.println("Enter II value");
        int var2 = sc.nextInt();
        
        int res = var1+var2;
        System.out.println("Total : "+res);
    }
    public static void main(String args[])
    {
        Sum obj = new Sum();
        obj.func();
    }
    
}
