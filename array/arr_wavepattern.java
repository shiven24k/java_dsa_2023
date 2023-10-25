import java.util.*;
public class arr_wavepattern {
    public static void wave(int [] arr) {
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[i+1]>arr[i]){
                arr[temp]=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=arr[temp];
                
              }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr={10,15,13,1,21,5,32};
        Arrays.sort(arr);
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        wave(arr);
         for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
