public class DemoLogika {
    public static void main(String[] args) {

        //beberapa nilai

        int i =37;
        int j = 42;
        int k= 42;

        System.out.println("Nilai Variabel...");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        //lebih besar dari
        System.out.println("Lebih besar dari...");
        System.out.println("i > j = " + (i > j)); //false
        System.out.println("j > i = " + (j > i)); //true
        System.out.println("k > j = " + (k > j)); //false

        //lebih besar dari atau sama dengan
        System.out.println("Lebih besar dari atau sama dengan...");
        System.out.println("i >= j = " + (i >= j)); //false
        System.out.println("j >= i = " + (j >= i)); //true
        System.out.println("k >= j = " + (k >= j)); //true

        //Lebih kecil dari
        System.out.println("Lebih kecil dari...");
        System.out.println("i < j = " + (i < j)); //true
        System.out.println("j < i = " + (j < i)); //false
        System.out.println("k < j = " + (k < j)); //false

        //Lebih kecil atau sama dengan
        System.out.println("Lebih kecil dari sama dengan...");
        System.out.println("i <= j = " + (i <= j)); //true
        System.out.println("j <= i = " + (j <= i)); //false
        System.out.println("k <= j = " + (k <= j)); //true

        //Sama Dengan
        System.out.println("Sama dengan . .");
        System.out.println("i == j = " + (i == j)); //false
        System.out.println("k == j = " + (k == j)); //false

        //Tidak sama Dengan
        System.out.println("Sama dengan . .");
        System.out.println("i != j = " + (i != j)); //false
        System.out.println("k != j = " + (k != j)); //false








    }
}