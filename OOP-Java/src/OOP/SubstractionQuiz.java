package OOP;

import java.util.Scanner;

public class SubstractionQuiz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int substraction;
        if(number1 >= number2)
            substraction = number1 - number2;
        else
            substraction = number2 - number1;
        System.out.println("pls input the substraction: ");
        int resultByUser = input.nextInt();
        if(resultByUser == substraction)
            System.out.println("Correct!!");
        else
            System.out.println("failure!!");
    }
}
