package Praktikum5.soal2;
import java.util.Scanner;
class Anjing extends HewanPeliharaan {
    String warnaBulu;
    String[] kemampuan;
    public Anjing(String r, String n, String w, String[] k) {
        super(r, n);
        this.warnaBulu = w;
        this.kemampuan = k;
    }
    public void DetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i]);
            if (i != kemampuan.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public void inputDetail(Scanner scanner) {
        System.out.print("Nama hewan peliharaan: ");
        nama = scanner.nextLine();
        System.out.print("Ras: ");
        ras = scanner.nextLine();
        System.out.print("Warna Bulu: ");
        warnaBulu = scanner.nextLine();
        System.out.print("Kemampuan : ");
        String kemampuanInput = scanner.nextLine();
        kemampuan = kemampuanInput.split(", ");
    }
}
