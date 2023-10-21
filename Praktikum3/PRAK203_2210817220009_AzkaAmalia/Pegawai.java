package Praktikum3.PRAK203_2210817220009_AzkaAmalia;

//nama class berbeda dengan nama file di mana class ini didefinisikan
//public class Employee {
public class Pegawai{
    public String nama;
//seharusnya menggunakan tipe data String untuk menyimpan data lebih dari satu karakter
//char hanya bisa menyimpan satu karakter dan penulisannya menggunakan petik satu
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //tidak mendefinisikan atau memuat parameter j pada method yang dibuat
//    public void setJabatan() {
//        this.jabatan = j;
//    }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}

