package Github;

import java.util.*;
public class DiscountCalculator {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Total Amount :");
        double a=sc.nextDouble();
        if (a>100){
            double d=a*10/100;
            System.out.println("Total amount : "+a);
            System.out.println("10% Discount : "+d);
            System.out.println("--------------------------");
            System.out.println("Pay : "+(a-d));
        }else if(a>=50 && a<=100){
            double d=a*5/100;
            System.out.println("Total amount : "+a);
            System.out.println("5% Discount : "+d);
            System.out.println("--------------------------");
            System.out.println("Pay : "+(a-d));
        }else{
            System.out.println("No Discount Available");
        }
    }
}
