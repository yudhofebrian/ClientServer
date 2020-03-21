public class Mahasiswa{
    private String nim;
    private String nama;
    private String kelas;

    public Mahasiswa(String namaa) {
        nama = namaa;
    }
    public Mahasiswa(String nim, String nama, String kelas){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }
    public Mahasiswa(){
        nama = "no name";
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNim(String nim){
        this.nim =nim;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public String getKelas(){
        return kelas;
    }
    public String info(){
        return "NIM :" + nim + "\n"+
                "Nama :" + nama + "\n" +
                "Kelas :" + kelas ;
    }
    public void print(){
        System.out.println(" NIM : " + nim);
        System.out.println(" Nama : "+ nama);
        System.out.println(" Kelas : "+ kelas);
    }
}