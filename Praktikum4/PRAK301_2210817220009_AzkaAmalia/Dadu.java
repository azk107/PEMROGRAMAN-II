package Praktikum4.PRAK301_2210817220009_AzkaAmalia;
import java.util.Random;
public class Dadu {
    int nilai;
    public Dadu() {
        acakNilai();
    }
    public void acakNilai() {
        Random acak = new Random();
        nilai = acak.nextInt(6) + 1;
    }
    public int getNilai() {
        return nilai;
    }
}
