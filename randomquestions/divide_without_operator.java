package randomquestions;

import java.util.*;

public class divide_without_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("undefined");
            return;
        }
        if (divisor == 1) {
            System.out.println(dividend);
            return;
        }
        if (divisor == -1) {
            System.out.println(-dividend);
            return;
        }
        // if(divisor==){

        // }

        int quotient = 0;
        int remainder = dividend;

        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        System.out.println("The ans is" + quotient + " when we divide " + dividend + " by " + divisor);
    }
}