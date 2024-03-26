package w3practicequestions.conditional.positvenegative;

//3. Write a Java program that takes three numbers from the user and prints the greatest number.

import java.util.*;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:");
        int x= sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int y= sc.nextInt();
        System.out.print("Enter 3rd Number:");
        int z= sc.nextInt();
        if(x>y && x>z){
            System.out.println(x+ "Is Greater");
        }
        else if (y>x && y>z){
            System.out.println(y+"IS Greater");
        }
        else if(z>x && z>y){
            System.out.println(z+"Is Greater");
        }
    }
}
