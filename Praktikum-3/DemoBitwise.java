public class DemoBitwise {
    public static void main(String[] args) {
        int x = 5, y = 6;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));

        //komplement
        int z = 8;
        System.out.println("z = " + z);

        int a = ~z; 
        System.out.println("a = " + a);
    }
}