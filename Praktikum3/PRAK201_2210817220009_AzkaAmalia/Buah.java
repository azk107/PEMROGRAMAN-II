package Praktikum3.PRAK201_2210817220009_AzkaAmalia;

public class Buah {
    protected String namaBuah;
    double beratBuah, harga, jumlahBeli, hargaSebelumDiskon, totalDiskon, hargaSetelahDiskon;

    public Buah(String namaBuah, double beratBuah, double harga, double jumlahBeli, double hargaSebelumDiskon){
        this.namaBuah = namaBuah;
        this.beratBuah = beratBuah;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
        this.hargaSebelumDiskon = hargaSebelumDiskon;
    }
    public void total_diskon(){
        totalDiskon = harga * 0.02 * 4 * Math.floor(jumlahBeli/4);
        System.out.println("Total Diskon: " + String.format("%.2f", totalDiskon));
    }
    public void harga_sebelum_diskon(){
        hargaSebelumDiskon = jumlahBeli/beratBuah*harga;
        System.out.println("Harga Sebelum Diskon: Rp" + String.format("%.2f", hargaSebelumDiskon));
    }
    public void harga_setelah_diskon(){
        hargaSetelahDiskon = hargaSebelumDiskon - totalDiskon;
        System.out.println("Harga Setelah Diskon: Rp" + String.format("%.2f", hargaSetelahDiskon));
    }
    public void dataBuah(){
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + beratBuah);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
    }
}
