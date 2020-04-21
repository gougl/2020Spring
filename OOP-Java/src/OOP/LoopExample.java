package OOP;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args){
        System.out.println("hello world");

        // use loop
        // for loop
        // initilization of loop variable; loop condition; stepwise;
//        for( int i = 1; i < 10; i = i*3){
//            System.out.println("Hello again");
//        }
//
//        int j = 1;
//        while(j<11){
//            System.out.println("hello more");
//            j = j*2; // j = 1; j = 2; j = 4; j= 8;
//        }
//
//        int k = 1;
//        do{
//            System.out.println("hello fourth");
//            k++;
//        }while(k<5);


        // data structures // algorithms
        // program = data structures + algorithms

        // pls output even numbers from 1 to 10 (2,4,6,8,10)
//        for(int i = 2; i < 11; i = i+2){
//            System.out.println(i);
//        }
//
//        // pls output odds numbers from 1 to 10
//        int j  = 1;
//        while(j <= 10){
//            System.out.println(j);
//            j = j + 2;
//        }

        // what's break
        // what's continue
//        for(int i=1; i<=10; i++){
//
//            if(i == 6)
//                break;
//            System.out.println(i);
//        }

        // prime number
        // divisor is 1 and itself
//        Scanner input = new Scanner(System.in);
//        int number =  input.nextInt();
//        int flag = 0;
//        for(int i=2; i<number; i++){
//            if(number % i == 0){
//                flag = 1;
//                break;
//            }
//        }
//        if(flag == 1)
//            System.out.println("not prime number");
//        else
//            System.out.println("yes, it is.");

        // prime numbers from 1 to 100
//        for(int i = 1; i<101; i++){
//            int flag = 1;
//            for (int j = 2; j<i; j++){
//                if(i % j == 0){
//                    flag = 0;
//                    break;
//                }
//            }
//            if(flag == 1)
//                System.out.println(i);
//
//        }

        // static method : Math.pow(2,3)
        // instance method depends on specific instance;

        //LoopExample le = new LoopExample();
        for(int i= 1; i<10; i++){
            if(PrimeNumber(i))
                System.out.println(i);
        }

        LoopExample instance = new LoopExample();
        instance.print();

    }

    // what's difference on syntax
    // static method can only call static method
    // static method calls instance method, should create an instance to invoke the instance method
    public static boolean PrimeNumber(int number){
        int flag = 0;
        for(int i=2; i<number; i++){
            if(number % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            return false;
        else
            return true;
    }

    // instance method can call instance method
    // instance method can also call static method
    public void print(){
        for(int i=1;i<10;i++)
            if (PrimeNumber(i))
                System.out.println(i);
        anotherprint();
    }

    public void anotherprint(){
        System.out.println("another print method, which is also instance method");
    }

}
