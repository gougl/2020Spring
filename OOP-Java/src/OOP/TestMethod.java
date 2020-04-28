package OOP;


import java.util.Scanner;

public class TestMethod {
    public static void main(String[] args){
        // static method: classname.methodname(arguments)
        int result = MethodExample.max(3, 5);
        System.out.println(result);

        // instance method: must depend on specific instance
        // cannot: classname.methodname
        // instance.instancemethod
        MethodExample me = new MethodExample();
        int result2 = me.min(3, 5);
        // instance.staticmethod
        int result3 = me.max(3, 5);
        System.out.println(result2);
        System.out.println(result3);

        MethodExample.print();

        System.out.println(MethodExample.max(2.0, 5.0));

        // primitive data type (int, long ,double, float, char, byte)is not reference type
        // it can not be changed by the method
        // pass by value
        int num1 = 10;
        int num2 = 20;
        MethodExample.swap(num1, num2);
        System.out.println(num1 + ","+ num2);

        // array is reference type
        // it can be changed by the method
        // pass by sharing / address, pointer in c
        int[] ar = new int[2];
        ar[0] = 10;
        ar[1] = 20;
        MethodExample.swap(ar);
        System.out.println(ar[0] + ","+ ar[1]);

//        for (int i = 1; i < 5; i++) {
//            int j = 0;
//            while (j < i) {
//                System.out.print(j + " ");
//                j++;
//            }
//            System.out.println();
//        }


        for(int i = 0; i<= 3; i++) {
            System.out.println("Hello");
        }
        for(int i = 1; i<4; i++)
            System.out.println("World");

    }
}
