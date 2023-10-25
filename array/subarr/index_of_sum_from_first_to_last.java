package array.subarr;

public class index_of_sum_from_first_to_last {
    
       public static void index( int []arr, int sum){  
        int from=0,to=0;
        for(int i = 0;i<arr.length;i++){
                if(arr[i]+arr[i+1]==sum){
                     from=i;
                     to=i+1;
                }
                
          }
          System.out.print("From"+from+"to"+to);
       }

       public static void main(int [] args){
          int arr[]={2,3,1,4,5,1};
          int sum=9;

          index(arr,sum);
       }    

}
