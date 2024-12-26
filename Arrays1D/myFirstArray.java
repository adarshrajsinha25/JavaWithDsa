import java.util.*;
class myFirstArray{
    public static void main(String[] args) {
        
        int sum = 0;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = SC.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++)
        { 
          System.out.println("enter the number of elements");
          arr[i] = SC.nextInt();
        } 
        
        for(int i = 0; i<arr.length; i++)
        {
           sum += arr[i];
        } 
        
      System.out.println("The total sum is:" + sum);
    }
    
}