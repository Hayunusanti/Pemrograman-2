import java.io.*;
public class jajal {
    public static void main(String[] args) throws IOException{

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String nama="", prodi="", usia="";
      

        System.out.print("Masukan Nama Anda : ");
        nama= dataIn.readLine();
        System.out.println("Masukan Prodi : ");
        prodi = dataIn.readLine();
        System.out.print("Masukan Usia Anda : ");
        usia = dataIn.readLine();

        System.out.println("Selamat Datang");
        System.out.println(nama);
        System.out.print(prodi);
        System.out.println(usia);
    }
}