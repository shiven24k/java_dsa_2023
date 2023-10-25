public class pattern7 {
    public static void the_big_A(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==n ||j==1||i==1||i==4){
                    System.out.print(" "+"x");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        the_big_A(7);
    }
}
