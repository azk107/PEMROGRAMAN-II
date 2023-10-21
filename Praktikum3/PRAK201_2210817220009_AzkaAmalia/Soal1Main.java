package Praktikum3.PRAK201_2210817220009_AzkaAmalia;

public class Soal1Main {
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0, 700000.00);
        Buah mangga = new Buah("mangga", 0.2, 3500.0, 15.0, 262500.00);
        Buah alpukat = new Buah("alpukat", 0.25, 10000.0, 12.0, 480000.00);

        apel.dataBuah();
        apel.total_diskon();
        apel.harga_sebelum_diskon();
        apel.harga_setelah_diskon();
        System.out.println("\n");
        mangga.dataBuah();
        mangga.total_diskon();
        mangga.harga_sebelum_diskon();
        mangga.harga_setelah_diskon();
        System.out.println("\n");
        alpukat.dataBuah();
        alpukat.total_diskon();
        alpukat.harga_sebelum_diskon();
        alpukat.harga_setelah_diskon();
    }
}

