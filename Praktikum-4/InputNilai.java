// import library IO untuk fungsi input data
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//bisa diringkas java.io.*;

public class InputNilai {
    public static void main(String[] args){

        
        String nim = "" , nama = "" , nama_makul="";
        float n_lain = 0;
        float n_uts = 0;
        float n_uas = 0;
        float na;
        //deklarasi objek bufferedreader dg nama variabel datainput
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan NIM : ");
        try{
            nim = dataInput.readLine();
        }catch(IOException ex){
            System.out.println("Error!" + ex);
        }
        System.out.print("\nMasukan Nama : ");
        try{
            nama = dataInput.readLine();
        }catch(IOException ex){
            System.out.print("Error!" + ex);
        }
        System.out.print("\nMasukan Nama Makul : ");
        try{
            nama_makul = dataInput.readLine();
        }catch(IOException ex){
            System.out.print("Error!" + ex);
        }
        System.out.print("\nMasukan Nilai Lain-lain : ");
        try{
            n_lain = Float.parseFloat(dataInput.readLine());
        }catch(IOException ex){
            System.out.print("Error!" + ex);
        }
        System.out.print("\nMasukan Nilai UTS : ");
        try{
            n_uts = Float.parseFloat(dataInput.readLine());
        }catch(IOException ex){
            System.out.println("Error!" + ex);
        }
        System.out.print("\nMasukan Nilai UAS : ");
        try{
            n_uas = Float.parseFloat(dataInput.readLine());
        }catch(IOException ex){
            System.out.println("Error!" + ex);
        }

        na = (0.4F * n_lain) + (0.3F * n_uts) + (0.3F * n_uas);
        System.out.println("NILAI AKHIR = " + na);
        if(na>=80){
            System.out.println("Grade A");
        }else if(na>=76 && na<=79){
            System.out.println("Grade AB");  
        }else if(na>=71 && na<=75){
            System.out.println("Grade B");
        }else if(na>=66 && na<=70){
            System.out.println("Grade BC");
        }else if(na>=61 && na<=65){
            System.out.println("Grade C");
        }else if(na>=56 && na<=60){
            System.out.println("Grade CD");
        }else if(na>=51 && na<=55){
            System.out.println("Grade D");
        }else if(na<=50){
            System.out.println("Grade E");
        }
    }
}