package Praktikum2;
import java.util.Scanner;
public class PRAK102_2210817220009_AzkaAmalia {
    public static void main(String[] args){
        int nilaiAwal,i=0;
        Scanner read = new Scanner(System.in);
        nilaiAwal = read.nextInt();
        while (i<=10){
            if (nilaiAwal % 5 == 0){
                System.out.print((nilaiAwal/5)-1);}
            else{
                System.out.print(nilaiAwal);}
            if (i < 10) {
                System.out.print(",");}
            nilaiAwal++; i++;
        }
    }
}
