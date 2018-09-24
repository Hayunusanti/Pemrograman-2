public class DemoIfElseIf {
    public static void main(String[] args){
        double grade = 92.0;

        if (grade >= 90) {
            System.out.println("Excelent");
        }else if( (grade < 90) && (grade >=80 )){

        }else if( (grade <80 ) && (grade >= 60)) {
            System.out.println("Study harder");
        }else{
            System.out.println("Sorry, You Failed");
        }
    }
}