package Github;

import java.util.*;
public class TriangleType {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Sides of Triangle");
        System.out.print("Enter A to B :");
        int a=sc.nextInt();
        System.out.print("Enter B to C :");
        int b=sc.nextInt();
        System.out.print("Enter C to A:");
        int c=sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("It is an Equilateral Triangle");
        }else if(a==c){
            System.out.println("it is an Isosceles Triangle");
        }else if (a!=b && b!=c && c!=a){
            System.out.println("It is an Scalene Triangle");
        }
    }
}
