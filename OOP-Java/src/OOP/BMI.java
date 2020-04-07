package OOP;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("pls input ur weight: ");
        double weight = input.nextDouble();
        System.out.println("pls input ur heigth: ");
        double height = input.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.println(bmi);
        if(bmi < 18.5)
            System.out.println("Underweight!!");
        else if(bmi < 25.0)
            System.out.println("Normal");
        else if(bmi < 30.0)
            System.out.println("Overweight");
        else
            System.out.println("Obese");


    }

}
