public class ShiftRight {
    public static void main(String[] args) {

        int x = 150;
        System.out.println(Integer.toBinaryString(x));

        x = 225;

        // Decimal: 112
        x = x >> 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = 1555;

        // Decimal: 777
        x = x >> 1;
        System.out.println("Decimal: "+ x);
        System.out.println("Binary: " + Integer.toBinaryString(x));

        x = 32456;

        //Decimal: 16228;
        x = x >> 1;
        System.out.println("Decimal: " + x);
        System.out.println("Binary: " + Integer.toBinaryString(x));






    }
}
