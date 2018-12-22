package Praktikum10.Latihan;

class Animal{
}
class Mammal extends Animal{}
class Cat extends Animal{}
public class Dolphin extends Mammal{
    
    public static void main(String[] args) {
        Mammal m = (Mammal) new Animal();
        Animal a = m;
        Dolphin d = (Dolphin) a;
    }
    
}
