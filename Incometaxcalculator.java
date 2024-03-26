package Practice;
import java.util.*;
public class Incometaxcalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Income tax Calculator");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Income");
        long I = sc.nextLong();

        if(I>250000 && I<=500000){
            long R = ((I/100)*5l);
            System.out.println("You have to pay"+R);
        }else if(I>500000 && I<=1000000){
            long R = ((I/100)*20l);
            System.out.println("You Have to pay"+R);
        }else if(I>1000000) {
            long R = ((I / 100) * 30l);
            System.out.println("You Have to pay : " + R);
        }else{
            System.out.println("You Don't have to pay any tax for income less than 250000");
        }
    }
}
