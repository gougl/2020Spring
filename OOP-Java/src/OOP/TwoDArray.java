package OOP;

public class TwoDArray {
    public static void  main(String[] args){
        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        print2darray(a);
        int re = sum2darray(a);
        System.out.println(re);

    }

    public static void print2darray(int[][] arr){
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }

    public static int sum2darray(int[][] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++)
            for(int j = 0; j<arr[i].length; j++)
                result += arr[i][j];


            return result;

    }
}
