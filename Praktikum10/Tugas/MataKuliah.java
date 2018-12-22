package Praktikum10.Tugas;


public class MataKuliah extends Prodi{
    String id_matkul;
    String nama_makul;
    String kode_dosen;
    String nama_dosen;

    public MataKuliah() {
    }
    
    public MataKuliah(String vid_matkul, String vnama_matkul, String vkode_dosen, String vnama_dosen){
        this.id_matkul = vid_matkul;
        this.nama_makul = vnama_matkul;
        this.kode_dosen = vkode_dosen;
        this.nama_dosen = vnama_dosen;
        
    }

    public String getId_matkul() {
        return id_matkul;
    }

    public void setId_matkul(String id_matkul) {
        this.id_matkul = id_matkul;
    }

    public String getNama_makul() {
        return nama_makul;
    }

    public void setNama_makul(String nama_makul) {
        this.nama_makul = nama_makul;
    }

    public String getKode_dosen() {
        return kode_dosen;
    }

    public void setKode_dosen(String kode_dosen) {
        this.kode_dosen = kode_dosen;
    }

    public String getNama_dosen() {
        return nama_dosen;
    }

    public void setNama_dosen(String nama_dosen) {
        this.nama_dosen = nama_dosen;
    }
    
}

