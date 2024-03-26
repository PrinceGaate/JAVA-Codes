package Functions;

import java.util.*;
public class length {
    static int lengthcalc(String src){
        int len=src.length();
        return len;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any String here : ");
        String src1= sc.nextLine();
        int len = lengthcalc(src1);
        System.out.println("The Length of given String is : "+len);
    }
}
