package Github;

import java.util.*;
public class negativepositivezero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int a= sc.nextInt();
        if(a>=0){
            System.out.println("The Given NUmber is Positive");
        }else if(a<=0){
            System.out.println("The Given Number is Negative");
        }else{
            System.out.println("The Given NUmber is Zero");
        }
    }
}