public class AndOrOpp {
    public static void main(String[] args) {
        // bit wise - 1
        int x = 7, y = 17;
        int z = x & y;
        System.out.println("Bitwise: " + z);

        // bitwise - 0
        z = x | y;
        System.out.println("Bitwise: " + z);



        //Postfix Operators
        int a = 20, b = 5, c = 0;
        b++;

        System.out.println(b);
        System.out.println(c);


        //Three ways to increment
        int i = 0;
        i += 1;
        System.out.println(i);
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);

        //Sum

        x = 5;
        y = 8;

        int Sum = x++ + y;

        //int PreSum = ++x + y;
        System.out.println("The value of PreSum is " + Sum);
        //System.out.println("The value of PostSum is " + PreSum);


    }
}
