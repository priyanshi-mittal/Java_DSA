public class ArraySecondDemo 
{   
    void func()
    {
        int ar[] = new int[5];
        ar[0] =10;
        ar[1] =20;
        ar[2] =30;
        ar[3] =40;
        ar[4] =50;
        System.out.println("-------Array elements-------");
        int size =ar.length;
        int sum =0;
        for(int i=0; i<size; i++)
        {
            sum =sum + ar[i];
            System.out.println(ar[i]);
        }
        System.out.println("No of elements :"+size);
        System.out.println("Sum of elements :"+sum);
    }
    public static void main(String args[])
    {
        ArraySecondDemo obj = new ArraySecondDemo();
        obj.func();
    }
}
