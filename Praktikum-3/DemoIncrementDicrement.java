public class DemoIncrementDicrement {

    public static void main(String[] args) {
        int x=1, y=1, z=1;

        //Nilai Awal
         
         System.o ut.println("Nilai x : " + x);
         System.out.println("Nilai y : " + y);
         System.out.println("Nilai z : " + z);


         //Increment
         x++; y++;
         System.out.println("\nNilai x : " + x);
         System.out.println("Nilai y : " + y++);
         System.out.println("Nilai z : " + ++z);

         System.out.println("\nNilai x : " + x);

         //Dicrement
         x--; y--;
         System.out.println("\nNilai x : " + x);
         System.out.println("Nilai y : " + y--);
         System.out.println("Nilai z : " + --z);

         System.out.println("\nNilai y : " + y);
    }
}