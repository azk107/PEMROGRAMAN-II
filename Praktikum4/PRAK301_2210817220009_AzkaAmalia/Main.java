package Praktikum4.PRAK301_2210817220009_AzkaAmalia;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        LinkedList<Dadu> daduList = new LinkedList<>();

        int jumlahDadu = read.nextInt();
        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
        }
        int total = 0;
        int i = 1;
        for (Dadu dadu : daduList) {
            int mataDadu = dadu.getNilai();
            total += mataDadu;
            System.out.println("Dadu ke-"+ i++ +" bernilai " + mataDadu);
        }
        System.out.println("Total nilai dadu keseluruhan: " + total);
    }
}
