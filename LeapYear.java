package Github;

import java.util.*;
public class LeapYear {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year :");
        int a= sc.nextInt();
        if (a%4==0){
            if(a%100==0 && a%400==0){
                System.out.println("It is a Leap Year and also a Century Year .");
            }else{
                System.out.println("It is a century year but not a Leap Year");
            }
        }else{
            System.out.println("Not a leap Year.");
        }
    }
}
