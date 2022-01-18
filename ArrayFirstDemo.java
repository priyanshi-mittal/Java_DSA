public class ArrayFirstDemo 
{
    void func()
    {
        int arr[] ={10, 20, 30,40,50};
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        ArrayFirstDemo obj = new ArrayFirstDemo();
        obj.func();
    }
}
