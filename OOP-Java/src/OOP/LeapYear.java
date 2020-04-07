package OOP;

public class LeapYear {
    public static void main(String[] args){
        // year must be from 1 to 2000
        for(int year=1; year<=2000; year++){
            if((year%4==0 && year%100!=0) || (year%400 == 0))
                System.out.println(year);
        }
    }
}
