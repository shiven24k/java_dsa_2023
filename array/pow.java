public class pow {
    public static void power(int n, int power) {
        int store=1;

        while(power>0){
            store = n * store;
            power--;
        }
        System.out.println(store);
    }
    public static void main(String[] args) {
        power(7,3);
    }
}
