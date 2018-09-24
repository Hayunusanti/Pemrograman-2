import java.util.Scanner;

public class Venjualan {
    public static void main (String[] args) {

        Scanner bayar = new Scanner(System.in);

        System.out.println("\t\t====PROGRAM MENGHITUNG TOTAL PENJUALAN====");

        System.out.println("Daftar Barang Terjual : ");

        System.out.println("Cilok\t\t= 5000 x 2");
        System.out.println("Cimin\t\t= 4000 x 2");
        System.out.println("Cireng\t\t= 8000 x 2");
        System.out.println("Siomay\t\t= 10000 x 1");
        System.out.println("Batagor\t\t=12000 x 4");

        //implisit
        int cilok=2;
        float cil = cilok;
        int cimin=2;
        float cim = cimin;
        int cireng=2;
        float cir= cireng; 
        int siomay = 1;
        float si = siomay;
        int batagor = 4;
        float bat = batagor;
    
        

        float x=(cil*5000F)+(cim*4000F)+(cir*8000F)+(si*10000F)+(bat*12000F);
        System.out.println("Total yang harus dibayar : "+x);

        System.out.print("Masukan uang\t\t : ");
        float cash = bayar.nextFloat(); 
        

        

        float kembalian= cash-x;
        System.out.println("Kembalianya sebesar     : "+kembalian);

        if(kembalian<0){
            System.out.println("Anda masih utang : "+-kembalian);
        }else{
            System.out.println("Terimakasih atas pembeliannya");
        }
      
    }


}