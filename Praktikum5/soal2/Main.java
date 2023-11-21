package Praktikum5.soal2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = read.nextInt();
        read.nextLine();
        HewanPeliharaan hewan = null;
        if (pilihan == 1) {
            hewan = new Kucing("", "", "");
            hewan.inputDetail(read);
        } else if (pilihan == 2) {
            hewan = new Anjing("", "", "", new String[]{});
            hewan.inputDetail(read);
        }

        if (hewan != null) {
            if (hewan instanceof Kucing) {
                ((Kucing) hewan).DetailKucing();
            } else {
                ((Anjing) hewan).DetailAnjing();
            }
        }
        read.close();
    }
}
