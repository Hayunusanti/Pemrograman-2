public class Invest{
    public static void main(String[] arguments) {
        float total = 14000;
        System.out.println("Original investment: $" + total);
        //increases 40 persen
        float a = total+(total*0.4F);
        System.out.println("After 1 year : $" +a);
        //loses
        float b=a-1500F;
        System.out.println("After 2 years : $" +b);
        //increases
        float c=b+(b*0.12F);
        System.out.println("After 3 years : $" +c);

    }
}