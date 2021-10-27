package com.asesmen2;
import java.util.ArrayList;

class Mobil {
    private String merk;
    private String thnKeluaran;
    private double harga;
    private int stok;

    public Mobil (String merk, String thnKeluaran, double harga, int stok) {
        this.merk = merk;
        this.thnKeluaran = thnKeluaran;
        this.harga = harga;
        this.stok = stok;
    }
    public String getMerk() {
        return merk;
    }
    public String getThnKeluaran() {
        return thnKeluaran;
    }
    public double getHarga(){
        return harga;
    }
    public int stok(){
        return stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    public int getStok(){
        return stok;
    }
    public void displayInfo(){
        System.out.println("Merk: " + merk + "\n" + "Harga: " + harga + "\n"
                + "Tahun Keluaran: " + thnKeluaran + "\n" + "Sisa stok: " + stok + "\n");
    }
}


public class ShowroomJaya {

    static ArrayList<Mobil> showroom = new ArrayList<Mobil>();

    public static void tambahMobil(Mobil data){
        showroom.add(data);
    }

    public static void beliMobil(String merk, String tahun, int jml){

        System.out.println("INPUT");
        System.out.println("Merk: " + merk + "\n" + "Tahun Keluaran: " + tahun + "\n" + "Jumlah: " + jml);
        System.out.println();

        for (Mobil mobil: showroom) {
            if(merk.equalsIgnoreCase(mobil.getMerk())
                    && tahun.equals(mobil.getThnKeluaran())
                    && jml <= mobil.getStok()){

                double hargaTotal = mobil.getHarga() * jml;
                double diskon = 0;
                double hargaDiskon = 0;

                if (jml == 1){
                    diskon = 0;
                    hargaDiskon = diskon;
                }
                if (jml == 2){
                    diskon = 10;
                    hargaDiskon = hargaTotal * 0.1;
                    mobil.setHarga(hargaDiskon);
                }
                if (jml > 2){
                    diskon = 20;
                    hargaDiskon = hargaTotal * 0.2;
                    mobil.setHarga(hargaDiskon);
                }
                System.out.println("OUTPUT");
                System.out.println("Merk: " + mobil.getMerk() + "\n" + "Harga Satuan: " + mobil.getHarga()
                        + "\n" + "Tahun Keluaran: " + mobil.getThnKeluaran() + "\n" +
                        "Jumlah Beli: " + jml + "\n" + "Total Harga: " + mobil.getHarga() * jml+ "\n"
                        +"Diskon: " + diskon + "%" + "\n" + "Total Diskon: " + hargaDiskon
                        + "\n" + "Total Bayar: " + (hargaTotal - hargaDiskon) + "\n");

                mobil.setStok(mobil.getStok()-jml);

            } else if (merk.equalsIgnoreCase(mobil.getMerk())
                    && tahun.equals(mobil.getThnKeluaran()) && mobil.getStok() < jml) {
                System.out.println("Maaf, Jumlah Stok Tidak Mencukupi\n");
            }
        }

    }
    public static void viewStok(){
        for (Mobil mobil : showroom){
            System.out.println("Informasi Mobil");
            mobil.displayInfo();
        }
    }

    public static void main(String[] args) {

        Mobil mobil = new Mobil("Avanza", "2018",  150000000, 5);
        Mobil mobil2 = new Mobil("Aston Martin", "2019", 394000000, 8);
        Mobil mobil3 = new Mobil("YARIS 1.5 G M/T 3 Airbags", "2020", 248300000, 6);
        tambahMobil(mobil);
        tambahMobil(mobil2);
        tambahMobil(mobil3);

        viewStok();

        beliMobil("Avanza","2018",1);
        beliMobil("Aston Martin", "2019",2);
        beliMobil("YARIS 1.5 G M/T 3 Airbags", "2020", 4);
        beliMobil("Avanza","2018",20);

        viewStok();


    }

}
