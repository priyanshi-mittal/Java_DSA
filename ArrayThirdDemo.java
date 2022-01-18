public class ArrayThirdDemo 
{
    ArrayThirdDemo()
    {
    int []arr = new int[5];
    
    arr[0] =10;
    arr[1] =22;
    arr[2] =14;
    arr[3] =16;
    arr[4] =18;
    
    System.out.println("----------Array elements----------");
    
    int i=0, sum=0;
    while(i<arr.length){
        System.out.println(arr[i]);
        sum = sum + arr[i];
        i++;
    }
    System.out.println("no. of elements :"+arr.length);
    System.out.println("sum of elements :"+sum);
    }
    public static void main(String[] args){
        ArrayThirdDemo obj = new ArrayThirdDemo();
    }
    
}