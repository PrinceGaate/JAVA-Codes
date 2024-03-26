package w3practicequestions.conditional.positvenegative;

//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

import java.util.*;
public class weekdays {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        if (a==1){
            System.out.println("Monday");
        }else if (a==2){
            System.out.println("Tuesday");
        }else if (a==3){
            System.out.println("Wednesday");
        }else if (a==4){
            System.out.println("Thrusday");
        }else if (a==5){
            System.out.println("Friday");
        }else if (a==6){
            System.out.println("Saturday");
        }else if (a==7){
            System.out.println("Sunday");
        }else{
            System.out.println("No day found");
        }
    }
}
