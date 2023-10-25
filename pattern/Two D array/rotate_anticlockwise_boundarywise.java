import java.util.*;
public class rotate_anticlockwise_boundarywise {
public static void change() {
    
}

public static void main(String[] args) {
    System.out.print("Enter array size");
       Scanner sc=new Scanner(System.in);
       int rows=sc.nextInt();
       int columns=sc.nextInt();
       
       System.out.println("Enter elements");    
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
         }

        System.out.println("Data you entered");
        for(int []x:twoD){
            for(int y:x){
            System.out.print(y+" ");
            }
            System.out.println();
        }
                    

}
    
}
