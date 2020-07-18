public class SimpleArray {
    public static void main(String[] args) {
        String[] bikes = new String[5];
        bikes[0] = "Honda CB500X";
        bikes[1] = "Honda XL700V Transalp";
        bikes[2] = "Yamaha 700 Tenere";
        bikes[3] = "KTM 790 Adventure";
        bikes[4] = "BMW GS850 Adventure";

        String bike = bikes[3];
            System.out.println("bike:"+bikes[3]);

            int numberOfElements = bikes.length;
            System.out.println("Number of elements in my array is "+bikes.length);
    }
}
