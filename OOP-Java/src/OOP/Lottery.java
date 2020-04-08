package OOP;

import java.util.Scanner;

public class Lottery {
    // Math.random() can obtain a random double value between 0.0 and 1.0 excluding 1.0.
    public static void main(String[] args){
        // [ 0.0, 1.0)
        // 2-digit integer number
        int number1 = (int)(Math.random()*100);
        int number2 = (int)(Math.random()*100);

        System.out.println("pls input two 2-digit integer numbers: ");
        Scanner input = new Scanner(System.in);
        int guess1 = input.nextInt();
        int guess2 = input.nextInt();

        if(guess1 == number1 && guess2 == number2)
            System.out.println("You win 10,000 dollars!!");
        if (guess1 ==  number2 && guess2 == number1)
            System.out.println("3,000 dollars");
        if ((guess1 == number1 && guess2!=number2) || (guess1==number2 && guess2!=number1))
            System.out.println("1,000 dollars");

        System.out.println("Sorry,  you lose");
        System.out.println(number1 + "," + number2);
    }
}
