package OOP;

import java.util.Scanner;

public class HiFive {
    public static void main(String[] args){
        System.out.println("pls input an integer:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if( a % 5 == 0)
            System.out.println("HiFive");
        if (a%2 == 0)
            System.out.println("HiEven");
    }
}
