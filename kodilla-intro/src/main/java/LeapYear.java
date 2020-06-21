public class LeapYear {
    public static void main(String[] args) {

        System.out.print("Input the year:");
        int year = 2020;

        boolean A = (year % 4) == 0;
        boolean B = (year % 100) != 0;
        boolean C = ((year % 100 == 0) && (year % 400 == 0));

        if (A && (B || C)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");}
    }
}



