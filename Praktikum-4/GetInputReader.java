import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputReader {
    public static void main(String[] args){

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nim = "" , nama = "";
        System.out.print("Masukan nama anda : ");

        try{
            nama = dataIn.readLine();
        }catch(IOException e) {
            System.out.println("Error!");
        }
        System.out.print("Masukan nim anda : ");

        try{
            nim = dataIn.readLine();
        }catch(IOException e){
            System.out.println("Error!");
        }

        System.out.println("");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _");
        System.out.println("Selamat datang " + nama);
        System.out.println("NIM : " + nim); 
    }
}