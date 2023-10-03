package Praktikum2;
import java.util.Scanner;
public class PRAK105_221081722009_AzkaAmalia {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double volume, jarijari, tinggi, phi=3.14;

        System.out.print("Masukkan jari-jari: ");
        jarijari = read.nextDouble();
        System.out.print("Masukkan tinggi: ");
        tinggi = read.nextDouble();

        volume = phi*(jarijari*jarijari)*tinggi;
        System.out.printf("Volume tabung dengan jari-jari " + jarijari + " cm dan tinggi " + tinggi + " cm adalah %.3f m3", volume );
    }
}
