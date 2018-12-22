package Praktikum10.Latihan;


class A {
    private final void Bergerak(){System.out.println("Animasi Berjalan");}
}

public class QOTD163 extends A{
    public final void Bergerak(){
        System.out.println("Bergerak");
    }
    public static void main(String arg[]){
        new QOTD163().Bergerak();
    }
}
