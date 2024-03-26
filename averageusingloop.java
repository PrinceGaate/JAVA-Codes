package Github;

import java.util.Scanner;

public class averageusingloop {
    public static void main(String[]args){
        float j=0f;
        for(int k=1;k<=1;k++){
            System.out.println("Enter Numbers :");
            for(int i=1;i<=10;i++){
                Scanner sc=new Scanner(System.in);
                i=sc.nextInt();
                j+=i;
            }
        }System.out.println("The Average of Given Input is :"+j/10);
    }
}
