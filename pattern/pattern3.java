public class pattern3 {
    public static void x_with_x(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j|| i+j==8){
                    System.out.print(" "+"x");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        x_with_x(7);
    }
}
