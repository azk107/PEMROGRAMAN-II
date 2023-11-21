package Praktikum5.soal2;
import java.util.Scanner;
class Kucing extends HewanPeliharaan {
    private String warnaBulu;
    public Kucing(String r, String n, String w) {
        super(r, n);
        this.warnaBulu = w;
    }
    public void DetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
    public void inputDetail(Scanner scanner) {
        System.out.print("Nama hewan peliharaan: ");
        nama = scanner.nextLine();
        System.out.print("Ras: ");
        ras = scanner.nextLine();
        System.out.print("Warna Bulu: ");
        warnaBulu = scanner.nextLine();
    }
}
