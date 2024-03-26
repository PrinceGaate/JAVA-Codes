package Github;

import java.sql.SQLOutput;
import java.util.*;
public class GradingSystem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUMBERS BETWEEN (0-100) :");
        System.out.println("ENTER MARKS SCORED BY THE STUDENT :");
        float a = sc.nextFloat();
        if(a>=90 && a<=100){
            System.out.println("Student get 'A' Grade");
        }else if(a>=80 && a<=89){
            System.out.println("Student get 'B' Grade");
        }else if(a>=70 && a<=79){
            System.out.println("Student get 'C' Grade");
        }else if(a>=60 && a<=69){
            System.out.println("Student get 'D' Grade");
        }else if(a>=50 && a<=59){
            System.out.println("Student get 'E' Grade");
        }else{
            System.out.println("Student get 'F' Grade");
        }
    }
}