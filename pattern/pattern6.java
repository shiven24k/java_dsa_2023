public class pattern6 {
    public static void the_big_U(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||j==n ||j==1){
                    System.out.print(" "+"x");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        the_big_U(6);
    }
}
