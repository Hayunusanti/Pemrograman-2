import javax.swing.*; //import semua library GUI
public class ExJOptionPane {
    public static void main(String[] args){

        

        String nim, nama, tempat, tgllahir;

        nama= JOptionPane.showInputDialog("Masukan Nama Anda :"); //mengisi var nama dgn object joptionpane dan method showinptdialog dgn parameter Masukan Nama Anda

        nim = JOptionPane.showInputDialog("Masukan NIM Anda : ");

        tempat = JOptionPane.showInputDialog("Masukan tempat lahir anda : ");
       
        tgllahir = JOptionPane.showInputDialog("Masukan Tanggal Lahir Anda : ");

        String msg = "Selamat Datang " + nama //
        +"\nNIM anda \t: " +nim
        +"\nTempat Lahir\t: "+tempat
        +"\nTanggal lahir\t: "+tgllahir;

        //JOptionPane.showMessageDialog(null,msg);
        JOptionPane.showMessageDialog(null, "Selamat Datang " + nama //memanggil objct joptionpane method showmessagedialog dgn parameter selamat datang
        +"\nNIM anda \t: " +nim
        +"\nTempat Lahir\t: "+tempat
        +"\nTanggal lahir\t: "+tgllahir);
    }
}