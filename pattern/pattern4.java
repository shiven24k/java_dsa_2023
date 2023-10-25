public class pattern4 {
    public static void the_big_T(int n) {
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 ||j==4){
                System.out.print(" x");
            }else{
                System.out.print(" "+" ");
            }
            
        }
        System.out.println("");
       }
    }
    public static void main(String[] args) {
        the_big_T(7);
    }
    
}
