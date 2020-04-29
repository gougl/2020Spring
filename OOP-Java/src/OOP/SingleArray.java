package OOP;

import java.util.Scanner;

public class SingleArray {
    public static void main(String[] args){
//        int[] arr;// declare
//        arr = new int[5]; // create , space
        //int[] arr = new int[5];//declare and create array // allocate space in memory
        //arr[0] = 1;//
//        System.out.println(arr[0]);
//
//        double[] b = {1.1, 2.3, 6.7, 9.9};
        /*
        double[] b = new double[4];
        double[0] = 1.1;
        double[1] = 2.3;
        double[3] = 6.7;
        double[4] = 9.9;
        */
//        System.out.println(b[3]);
//        System.out.println(b.length);
        //System.out.println(b[b.length-1]);
//        inputArray(arr);
//        outputArray(arr);
//        System.out.println(sumArray(arr));
//        System.out.println(averageArray(arr));
//        System.out.println(maxArray(arr));
//        System.out.println(minArray(arr));
//        System.out.println(indexOfMax(arr));

        int[] a = {2,6,9};
        int[] b = new int[a.length];
        copyArray(b, a);
        outputArray(a);
        b[1] = 5;
        outputArray(b);
        int[] c = a;
        outputArray(c);

        int num = 5;
        changeValue(num, b);
        System.out.println(num + "," + b[0]);
        int[] d = reverseArray(a);
        outputArray(d);
        System.out.println(findElem(a,11));
    }

    public static void inputArray(int[] arr){
        Scanner input = new Scanner(System.in);
        // whitespace, tabs, carriage return to input
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void outputArray(int[] arr){
        for(int i=0; i < arr.length; i++)
            System.out.println(arr[i]);
        // new syntax supported after java 8
//        for (int val: arr)
//            System.out.println(val);
    }

    public static int sumArray(int[] arr){
        int sum = 0;
        for(int i= 0; i < arr.length; i++){
            sum += arr[i];
            // sum = sum + arr[i];
        }
        return sum;
    }

    public static double averageArray(int[] arr){
        int sum = sumArray(arr);
        return (double)sum/arr.length;
    }

    public static int maxArray(int[] arr){
        int max = arr[0];
        for(int i=1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int minArray(int[] arr){
        int min = arr[0];
        for(int i=1; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int indexOfMax(int[] arr){
        int index = 0;
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void copyArray(int[] target, int[] source){
        for(int i=0; i < source.length; i++)
            target[i] = source[i];
    }

    public static void changeValue(int a, int[] ar){
        a = 10;
        ar[0] = 999;
    }

    public static int[] reverseArray(int[] list){
        int[] result = new int[list.length];
        int j = result.length-1;
        for(int i=0; i < list.length; i++) {
            result[j] = list[i];
            j--;
        }
        return result;
    }

    public static boolean findElem(int[] list, int elem){
        for(int i = 0; i < list.length; i++){
            if(list[i] == elem)
                return true;
        }
        return false;
    }
}
