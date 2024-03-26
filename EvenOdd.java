package Github;

import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Given Number is Even ");
        }else {
            System.out.println("Given NUmber is Odd");
        }
    }
}
