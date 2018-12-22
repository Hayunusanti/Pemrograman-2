package Praktikum10.Tugas;


public class Mahasiswa extends Prodi {
   String nim;
   String nama_mahasiswa;
   
   
   public Mahasiswa(){
       
   }
   
   public Mahasiswa( String vnim, String vnama_mahasiswa){
       this.nim = vnim;
       this.nama_mahasiswa = vnama_mahasiswa;
   }

    public String getNim() {
        return nim;
    }

    public void setNim(String vnim) {
        this.nim = vnim;
    }

    public String getNama_mahasiswa() {
        return nama_mahasiswa;
    }

    public void setNama_mahasiswa(String vnama_mahasiswa) {
        this.nama_mahasiswa = vnama_mahasiswa;
    }
   
   
}
