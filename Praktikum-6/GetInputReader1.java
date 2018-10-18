import java.io.*;

public class GetInputReader1 {
    public static void main (String[] args) throws IOException{
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));

        String nim ="", nama="", tempat="", tgllahir="";
        System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
        System.out.print("Masukkan Nim : ");
            nim = dataIn.readLine();
        System.out.print("Masukkan Tempat Lahir Anda : ");
            tempat = dataIn.readLine();
        System.out.print("Masukkan Tanggal Lahir Anda : ");
            tgllahir = dataIn.readLine();

        System.out.print("");
        System.out.print("---------------------");
        System.out.print("---------------------");
        System.out.print("Selamat Datang " + nama);
        System.out.print("Nim " +nim);
        System.out.print("Tempat Lahir " + tempat);
        System.out.print("Tanggal Lahir " + tgllahir);
    
    }
}