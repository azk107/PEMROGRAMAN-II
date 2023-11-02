package Praktikum4.PRAK303_2210817220009_AzkaAmalia;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        int pilihan=-1;
        while (pilihan!=0) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = read.nextInt();
            read.nextLine();
            if (pilihan != 1) {
                if (pilihan != 2) {
                    if (pilihan==3) {
                        System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                        String nim = read.nextLine();
                        for (Mahasiswa mahasiswa : daftarMahasiswa) {
                            if (mahasiswa.getNIM().equals(nim)) {
                                System.out.println("Data Mahasiswa ditemukan: " + mahasiswa.getNama());
                                break;
                            }
                        }
                    } else if (pilihan==4) {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa mahasiswa : daftarMahasiswa) {
                            System.out.println("NIM: "+mahasiswa.getNIM()+", Nama: "+mahasiswa.getNama());
                        }
                    } else if (pilihan==0) {
                        System.out.println("Terima kasih!");
                        daftarMahasiswa.clear();
                    }
                } else {
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nim = read.nextLine();
                    for (Mahasiswa mahasiswa : daftarMahasiswa) {
                        if (mahasiswa.getNIM().equals(nim)) {
                            daftarMahasiswa.remove(mahasiswa);
                            System.out.println("Mahasiswa dengan NIM "+nim+" dihapus.");
                            break;
                        }
                    }
                }
            } else {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = read.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = read.nextLine();
                Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                daftarMahasiswa.add(mahasiswa);
                System.out.println("Mahasiswa "+nama+" ditambahkan.");
            }
        }
    }
}
