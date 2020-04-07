package OOP;

import java.awt.*;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int sum = number1 + number2;
        System.out.println("pls input the answer: ");
        int resultByUser = input.nextInt();
        if(resultByUser == sum)
            System.out.println("Correct!!");
        else
            System.out.println("Failure!!");

    }
}
