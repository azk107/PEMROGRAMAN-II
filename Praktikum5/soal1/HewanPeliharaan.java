package Praktikum5.soal1;
public class HewanPeliharaan {
    String nama, ras;
    public HewanPeliharaan(String n, String r) {
        this.nama = n;
        this.ras = r;
    }
    public void inputNama() {
        System.out.print("Nama Hewan Peliharaan: ");
    }
    public void inputRas() {
        System.out.print("Ras: ");
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}

