package Praktikum2;
import java.util.Scanner;
public class PRAK101_2210817220009_AzkaAmalia {
    public static void main (String[] args) {
        String nama, tl;
        int tgl, bl, tahun;
        double tb, bb;
        Scanner read = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        nama = read.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        tl = read.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        tgl = read.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        bl = read.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        tahun = read.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        tb = read.nextDouble();
        System.out.print("Masukkan Berat Badan: ");
        bb = read.nextDouble();

        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tl + " pada Tanggal" + " " + tgl + " " + namaBulan[bl-1] + " " + tahun);
        System.out.println("Tinggi Badan " + tb + "cm " + "dan Berat Badan " + bb + " kilogram");
    }
}
