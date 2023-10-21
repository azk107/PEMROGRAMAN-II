package Praktikum3.PRAK202_2210817220009_AzkaAmalia;

public class Kopi {
    String namaKopi, ukuran, pembeli;
    double harga, pajak;

    public String getPembeli() {
        return pembeli;
    }
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }
    public double getPajak(){
        pajak = harga / 100 * 11;
        return pajak;
    }
    public void info(){
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: " + harga);
    }
}
