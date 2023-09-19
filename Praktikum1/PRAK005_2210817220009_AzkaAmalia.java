package Praktikum1;
import java.util.Scanner;
public class PRAK005_2210817220009_AzkaAmalia {
    public static void main (String[] args){
        String makanan, hobi;

        Scanner read = new Scanner(System.in);

        System.out.println("Masukkan Makanan Favorit: ");
        makanan = read.next();
        System.out.println("Masukan Hobi: ");
        hobi = read.next();
        System.out.println("Aku Suka Makan " + makanan + ", dan Hobiku " + hobi);
    }
}
