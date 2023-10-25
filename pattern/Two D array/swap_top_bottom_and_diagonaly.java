import java.util.*; 
public class swap_top_bottom_and_diagonaly {
    public static void main(String[] args) {
        
        System.out.print("Enter array size");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       
       System.out.println("Enter elements");    
        
       int arr[][]=new int[rows][columns];
       int temp=0;
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
         }
           System.out.println("Data you entered");
        for(int []x:arr){
            for(int y:x){
            System.out.print(y+" ");
            }
            System.out.println();
        }

         
         //swap top with bottom
         for(int i=0; i<rows;i++)
         {            
            // for(int j=0; j<columns;j++)
            // {
            //swaping top with bottom
              temp=arr[0][i];
              arr[0][i]=arr[rows-1][i];
              arr[rows-1][i]=temp; 

            //swapping diagonally
              temp=arr[i][i];
              arr[i][i]=arr[i][arr.length-1-i];
              arr[i][arr.length-1-i]=temp; 
              
              
            //}
         }

               
        
         System.out.println("Data you entered after swap");
        for(int []x:arr){
            for(int y:x){
            System.out.print(y+" ");
            }
            System.out.println();
        }

    }
    
}
