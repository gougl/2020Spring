package OOP;
import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("pls input integer of seconds:");
        int seconds = input.nextInt();

        int minute = seconds / 60;
        int second = seconds % 60;

        System.out.println(minute + ":" + second);

    }



}