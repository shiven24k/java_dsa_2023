public class pattern_traiangle_number {
    public static void main(String[] args) {
        int i,j;
        for( i =1;i<=5;i++){
            //space
            for( j =1;j<=5-i;j++){
            System.out.print(" ");
            }
            //for 2
            if(i>=2){
            //from 2 to i+1 for every printing element
            for(j =2;j<=i+1;j++){

            System.out.print(j);
            }
            //from i to greater thank equal to 2
            for(j =i;j>=2;j--){
            
            System.out.print(j);
            }
        }
        //for 1 when i < 2
        else{
            System.out.print(i);
        }

          System.out.println();
         }
       
    }
}
//     1
//    232
//   23432
//  2345432
// 234565432