//To enter an array from an user 
import java.util.*;
public class arr_peak {
    public static void peak() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Input the elements of array"); 
       //inputting an array
        for(int i =0 ; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        //output 
        for(int i =0; i<n-1;i++){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1] ){
                       System.out.print(arr[i]+" ");
            }
        }
        

    }
    public static void main(String[] args) {
        peak();
    }
}
