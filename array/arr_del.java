public class arr_del {
    public static void delArr(int []arr ,int elmnt) {
        for (int i =0;i<arr.length;i++){
            if(arr[i]==elmnt){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
        
        
    }
    
    public static void main(String[] args) {
    int []arr={2,3,4,2,5,1};
    int elmnt =5;
    delArr(arr,elmnt);
    
   }
}
