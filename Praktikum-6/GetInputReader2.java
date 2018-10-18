import java.io.*; //Library untuk Inputan keyboard
public class GetInputReader2 { //Membuat Kelas dngn nama sama kaya nama file e
    public static void main(String[] args) throws IOException{ //membuat method main dengan modifier/visibility public dan memlempar IOException (Library untuk mendeteksi error)

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in)); //Membuat object baru dengan nama dataIn menggunakan class Bufferedreader dan parameter object class InputStreamReader dan parameter systemIn

        String nim="", nama="", tempat="", tgllahir="";//Reti dewwe lah
        System.out.print("Masukan Nama Anda : "); //Ora usah di jelasne maning
        nama= dataIn.readLine(); //memberi nilai var nama dengan object dataIn method readLine()

        System.out.print("MasukanNIM Anda : "); //Reti dewe lah
        nim= dataIn.readLine(); //Podo nduwure

        System.out.print("Masukan tempat lahir anda : ");
        tempat = dataIn.readLine();

        System.out.print("Masukan Tanggal Lahir Anda : ");
        tgllahir = dataIn.readLine();

        System.out.println("");
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("Selamat Datang " + nama);
        System.out.println("NIM     : " + nim );
        System.out.println("Tempat Lahir    : " + tempat);
        System.out.println("Tanggal Lahir   : " + tgllahir);
    }
}
    