package OOP;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args){
//        System.out.println("pls input the year:");
//        Scanner input = new Scanner(System.in);
//        int year = input.nextInt();
//        switch (year % 12){
//            case 0:
//                System.out.println("monkey");
//                break;
//            case 1:
//                System.out.println("rooster");
//                break;
//            case 2:
//                System.out.println("ox");
//                break;
//            default:
//                System.out.println("other zodiac");
//        }

        double a = Math.floor(4.6);
        double b = Math.ceil(4.6);
        double c = Math.pow(2, 3);
        System.out.println(a + "," + b + "," +c);
        // [ 7, 21)
        // a + (int)(Math.random()*b) ---> [a, a+b)
        int num = 7 + (int)(Math.random()*14);
        System.out.println(num);

    }
}
