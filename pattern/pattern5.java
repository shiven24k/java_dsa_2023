public class pattern5 {
    public static void the_big_S(int n) {
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==9  || i<=5 && j==1 || i>=5 && j==9 || i==5) {
                    System.out.print(" "+"x");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        the_big_S(9);
    }
}
