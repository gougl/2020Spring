package OOP;

public class MethodExample {
    // an operation

    // static method
    public static int max(int a, int b){ // method signature
        if (a >= b)
            return a;
        return b;
    }
    // overloading: same method name but different parameters
    // different method signature
    public static double max(double a, double b){
        if (a >= b)
            return a;
        return b;
    }

    // override: the same method in different class
    // protected: invoked by the same package or the subclass
    // private method can be invoked by the same class
    private static int max2(int a, int b){
        if (a >= b)
            return a;
        return b;
    }

    // instance method
    public int min(int a, int b){
        if ( a <=b )
            return a;
        return b;
    }

    public static void main(String[] args){
        System.out.println(max2(3, 5));

    }

    public static void print(){
        System.out.println("this is print method");
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swap(int[] a){
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

}
