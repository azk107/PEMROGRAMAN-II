package Praktikum2;
import java.util.Scanner;
public class PRAK103_2210817220009_AzkaAmalia {
    public static void main(String[] args){
        int i=0, jumlah, nilaiAwal;
        Scanner read = new Scanner(System.in);

        jumlah = read.nextInt();
        nilaiAwal = read.nextInt();
        do{
            if(nilaiAwal % 2 != 0){
                System.out.print(nilaiAwal);
                if(i<jumlah-1){
                    System.out.print(",");}
                i++;
            }
            nilaiAwal++;
        }
        while (i<jumlah);
    }
}
