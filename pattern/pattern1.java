public class pattern1 {
    public static void upside_sideways(int n) {
        for(int i=1;i<=n*2;i++){
            for(int j=1;j<=2*n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i>4 ){
                    System.out.print(" ");
                }else{
                    System.out.print("x");
                }
            }
            System.out.println("");
             for(int j=4;j>i-n;j--){
                if(i>3 ){
                    System.out.print("x");
                }
            }
        }
    }
    public static void main(String[] args) {
        upside_sideways(4);
    }
}
