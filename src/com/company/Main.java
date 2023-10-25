package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the marks you got in MST");
            int num = sc.nextInt();

            if(num>=31 && num<=40){
                System.out.println("You are passed with flying numbers, You got Grade A");
            }else if(num>=21 && num<=30){
                System.out.println("You passed gracefully but you can do better than that, You got Grade B ");
            }
            else if(num>=11 && num<=20){
                System.out.println("You barely made it out on the passing line, Work even harder than before, You got Grade C ");
            }
            else if(num>=0 && num<=10){
                System.out.println("You are not able to make it out of this exam without working hard,Manage Extra classes for extra classes, You got Grade C which means try again ");
            }
            else{
                System.out.println("ERROR, YOu myst have wrote number out of bound");
            }
        }
    }


