package Praktikum3.PRAK203_2210817220009_AzkaAmalia;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //tidak memuat titik koma sehingga kode menjadi error
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //diperlukan penambahan statement untuk menyatakan niai umur
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //sebelumnya tidak ada statement untuk menyatakan umur oleh karena itu output umur akan bernilai 0 saat di run
        //output yang keluar kurang sesuai karena seharusnya ada penambahan kata "tahun" setelah nilai umur
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}