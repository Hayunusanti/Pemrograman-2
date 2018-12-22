
package Praktikum10.Tugas;


public class NilaiMataKuliah extends MataKuliah{
  Double bobot_uts;  
  Double bobot_uas;
  Double bobot_lain2;
  Double nilai_uts;
  Double nilai_uas;
  Double nilai_lain2;
  Double nilai_akhir;
  String Grade;

  Mahasiswa mhs;
  public Double hitungNilai(){
      nilai_akhir = ((0.3*nilai_uts)+(0.3*nilai_uas)+(0.4*nilai_lain2));
      return nilai_akhir;
  }
  public void hitungGrade(){
      if (nilai_akhir >= 80 && nilai_akhir <=100){
            System.out.println("Grade A");
            this.Grade="A";
        }else if (nilai_akhir >=76 || nilai_akhir <=79){
            System.out.println("Grade AB");
            this.Grade="B";
        }else if (nilai_akhir >=70 || nilai_akhir <=75){
            System.out.println("Grade B");
            this.Grade="B";
        }else if (nilai_akhir >=66 || nilai_akhir <=69){
            System.out.println("Grade BC");
            this.Grade="BC"; 
        }else if (nilai_akhir >=60 || nilai_akhir <=65){
            System.out.println("Grade C");
            this.Grade="C";
        }else if (nilai_akhir >=56 || nilai_akhir <=59){
            System.out.println("Grade CD");
            this.Grade="CD";
        }else if (nilai_akhir >=50 || nilai_akhir <=55){
            System.out.println("Grade D");
            this.Grade="D";
        }else{
            System.out.println("Grade E");
            this.Grade="E";
        }   
  }
}
