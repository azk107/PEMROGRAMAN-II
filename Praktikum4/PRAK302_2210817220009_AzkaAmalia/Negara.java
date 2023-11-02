package Praktikum4.PRAK302_2210817220009_AzkaAmalia;
import java.util.HashMap;
public class Negara {
    String nama, jenisKepemimpinan, namaPemimpin;
    int tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan;
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }
    String bulan(int bulan) {
    HashMap<Integer, String> bulanMap = new HashMap<>();
        bulanMap.put(1, "Januari");
        bulanMap.put(2, "Februari");
        bulanMap.put(3, "Maret");
        bulanMap.put(4, "April");
        bulanMap.put(5, "Mei");
        bulanMap.put(6, "Juni");
        bulanMap.put(7, "Juli");
        bulanMap.put(8, "Agustus");
        bulanMap.put(9, "September");
        bulanMap.put(10, "Oktober");
        bulanMap.put(11, "November");
        bulanMap.put(12, "Desember");
        return bulanMap.get(bulan);
    }
    String getNama() {
        return nama;
    }
    String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }
    String getNamaPemimpin() {
        return namaPemimpin;
    }
    String getTanggalKemerdekaan() {
        return "Tanggal " + tanggalKemerdekaan + " " + bulan(bulanKemerdekaan) + " " + tahunKemerdekaan;
    }
}
