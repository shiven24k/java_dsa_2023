import java.util.*;
public class arr_rotate {
    public static void rotate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the given array");
        int arr[]=new int[n];
   
        //inputting an array
        for(int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        //reverse
        System.out.println("Enter the number of rotation of the given array");
        int rotation =sc.nextInt(); 
        //to change the roatation
        int first=0,last=arr.length-1,temp;
         for(int i=1;i<rotation;i++){
            temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
         }
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }

    }
    public static void main(String[] args) {
        rotate();
    }
}
