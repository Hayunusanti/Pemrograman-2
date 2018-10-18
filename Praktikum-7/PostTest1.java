import java.io.*;
public class PostTest1 {

    public static void main(String[] args) throws IOException{
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in)); 

        int menu;
        String  kodebarang[] = new String[50];
        String namabarang[] = new String[50];
        float harga[] = new float[50];
        int jumlah[] = new int[50];
        String pilih = "";
        boolean status1 = false;
        boolean status2 = false;
        int x =0;

        do{
            System.out.println(".: Menu App :.");
            System.out.println("(1) Input Data Barang");
            System.out.println("(2) Cetak Data Barang");

            System.out.print("Pilih Menu : ");
            menu = Integer.parseInt(dataInput.readLine());  

            if(menu == 1){
                do{
                    System.out.print("Masukan Kode Barang : ");
                        kodebarang[x] = dataInput.readLine();
                    System.out.print("Masukan Nama Barang : ");
                        namabarang[x] = dataInput.readLine();
                    System.out.print("Masukan Harga : ");
                       harga[x] = Float.parseFloat(dataInput.readLine());
                    System.out.print("Masukan Jumlah : ");
                       jumlah[x] = Integer.parseInt(dataInput.readLine());

                    System.out.print("Apakan anda akan  melakukan input lagi? : Y/N ");
                    pilih = dataInput.readLine();

                    if(pilih.equals("Y")){
                        status1 = true;
                        x++;
                    }else{
                        status1 = false;
                        status2 = true;
                    }
                }while(status1);
            }else if(menu == 2){
                for(int i=0; i<kodebarang.length; i++){

                    if(!kodebarang[i].equals("")){
                        System.out.println("Kode Barang : " +kodebarang[i]);
                        System.out.println("Nama Barang : " +namabarang[i]);
                        System.out.println("Harga : " +harga[i]);
                        System.out.println("jumlah : " +jumlah[i]);
                        System.out.println("\n");
                    }else{
                        break;
                    }
                }
            }
        }while(status2);
    }
    }