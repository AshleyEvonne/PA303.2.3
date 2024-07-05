public class ShiftLeft {
    public static void main (String[] args){


        int x = 9;

        // Decimal: 18, Binary: 10010
        x = x << 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));


        x = 17;

        // Decimal: 34, Binary: 100010
        x = x << 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));



        x = 88;

        // Decimal: 176, Binary: 10110000
        x = x << 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

    }
}
