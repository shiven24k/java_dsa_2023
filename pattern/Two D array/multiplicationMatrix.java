import java.util.Scanner;


public class multiplicationMatrix {
    public static void matrix() {
        
    }
    public static void main(String []args){
       System.out.print("Enter array size of first array ");
       Scanner sc=new Scanner(System.in);
       int rows1=sc.nextInt();
       int columns1=sc.nextInt();
       
       System.out.println("Enter elements");    
        
       int twoDOne[][]=new int[rows1][columns1];
        
          
        for(int i=0; i<rows1;i++)
         {            
            for(int j=0; j<columns1;j++)
            {
                twoDOne[i][j]=sc.nextInt();
            }
         }

       System.out.print("Enter array size second array");
       int rows2=sc.nextInt();
       int columns2=sc.nextInt();
       
       System.out.println("Enter elements");    
        
       int twoDTwo[][]=new int[rows2][columns2];
        
          
        for(int i=0; i<rows2;i++)
         {            
            for(int j=0; j<columns2;j++)
            {
                twoDTwo[i][j]=sc.nextInt();
            }
         }

         System.out.println("Data you entered");
        for(int []x:twoDOne){
            for(int y:x){
            System.out.print(y+" ");
            }
            System.out.println();
        }
        System.out.println("Data you entered");
        for(int []x:twoDTwo){
            for(int y:x){
            System.out.print(y+" ");
            }
            System.out.println();
        }

        
    }
    
}
