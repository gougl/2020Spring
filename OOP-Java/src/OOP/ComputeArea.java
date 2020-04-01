package OOP;
import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args){
        double radius;
        double area;
        // declare the constant using 'final'
        final double PI = 3.14;

        // input the value from keyboard
        Scanner input = new Scanner(System.in);

        radius = input.nextDouble();

        area = radius * radius * PI;

        int h = input.nextInt();


        System.out.println(area + "," + h);
    }
}
