package Praktikum2;
import java.util.Scanner;
public class PRAK104_2210817220009_AzkaAmalia {
    public static void main(String[] args){
        int poinAbu, poinBagas;
        Scanner read = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String tanganAbu = read.nextLine();
        System.out.print("Tangan Bagas: ");
        String tanganBagas = read.nextLine();

        poinAbu = 0;
        poinBagas = 0;
        for (int i = 0; i <= 4; i+=2) {
            if (tanganAbu.charAt(i) == 'G' && tanganBagas.charAt(i) == 'K'
                    || tanganAbu.charAt(i) == 'B' && tanganBagas.charAt(i) == 'G'
                    || tanganAbu.charAt(i) == 'K' && tanganBagas.charAt(i) == 'B') {
                poinAbu += 1;
            }
            if (tanganBagas.charAt(i) == 'G' && tanganAbu.charAt(i) == 'K'
                    || tanganBagas.charAt(i) == 'B' && tanganAbu.charAt(i) == 'G'
                    || tanganBagas.charAt(i) == 'K' && tanganAbu.charAt(i) == 'B') {
                poinBagas += 1;
            }
        }
        if (poinAbu > poinBagas) {
            System.out.println("Abu");}
        else if (poinBagas > poinAbu) {
            System.out.println("Bagas");}
        else {
            System.out.println("Seri");}
    }
}
