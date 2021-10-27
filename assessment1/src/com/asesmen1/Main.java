package com.asesmen1;

class MarketPlace{
    private String jenis;
    private String namaJual= "Eiger";
    private String alamatJual= "Bandung";
    private String namaBeli;
    private String alamatBeli;
    private float ongkir;
    private String namaEkspedisi;
    private String noResi;
    private int noTransaksi;
    private float nominalAsuransi;
    private String statusAsuransi;
    private String namaDrp;
    private String alamatDrp;
    private String statusDrp;

    //konstruktor penyimpanan data
    //untuk data utama
    public MarketPlace (String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkir, String namaJual, String alamatJual, String namaBeli, String alamatBeli) {
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaJual = namaJual;
        this.alamatJual = alamatJual;
        this.namaBeli = namaBeli;
        this.alamatBeli = alamatBeli;
    }
    //untuk data utama + data asuransi
    public MarketPlace (String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkir, String namaJual, String alamatJual, String namaBeli, String alamatBeli, float nominalAsuransi, String statusAsuransi) {
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaJual = namaJual;
        this.alamatJual = alamatJual;
        this.namaBeli = namaBeli;
        this.alamatBeli = alamatBeli;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
    }

    //untuk data utama + data dropshipper
    public MarketPlace (String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkir, String namaJual, String alamatJual, String namaBeli, String alamatBeli, String namaDrp, String alamatDrp, String statusDrp) {
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaJual = namaJual;
        this.alamatJual = alamatJual;
        this.namaBeli = namaBeli;
        this.alamatBeli = alamatBeli;
        this.namaDrp = namaDrp;
        this.alamatDrp = alamatDrp;
        this.statusDrp = statusDrp;
    }

    //untuk data utama + data asuransi + data dropshipper
    public MarketPlace (String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkir, String namaJual, String alamatJual, String namaBeli, String alamatBeli, float nominalAsuransi, String statusAsuransi, String namaDrp, String alamatDrp, String statusDrp) {
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkir = ongkir;
        this.namaJual = namaJual;
        this.alamatJual = alamatJual;
        this.namaBeli = namaBeli;
        this.alamatBeli = alamatBeli;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
        this.namaDrp = namaDrp;
        this.alamatDrp = alamatDrp;
        this.statusDrp = statusDrp;
    }

    //method cetak struk
    public void strukAsuransiDrp(){
        System.out.println(jenis);
        System.out.println("No Transaksi: " + noTransaksi + "\n" + "No Resi: " + noResi + "\n"
        + "Nama Ekspedisi: " + namaEkspedisi + "\n" + "Ongkos Kirim: " + ongkir + "\n" + "Nama Pengirim: " + namaDrp +
                "\n" + "Alamat Pengirim: " + alamatDrp + "\n" + "Nama Penerima: " + namaBeli + "\n" + "Alamat Penerima: " + alamatBeli
                + "\n" + "Nominal Asuransi: " + nominalAsuransi);

        System.out.println();
        System.out.println();
    }
    public void strukAsuransi(){
        System.out.println(jenis);
        System.out.println("No Transaksi: " + noTransaksi + "\n" + "No Resi: " + noResi + "\n" + "Nama Ekspedisi: " + namaEkspedisi
                + "\n" + "Ongkos Kirim: " + ongkir + "\n" + "Nama Pengirim: " + namaJual + "\n" + "Alamat Pengirim: " + alamatJual
                + "\n" + "Nama Penerima: " + namaBeli + "\n" + "Alamat Penerima: " + alamatBeli + "\n" + "Alamat Penerima: " + alamatBeli
                + "\n" + "Nominal Asuransi: " + nominalAsuransi);

        System.out.println();
        System.out.println();
    }
    public void strukNormal(){
        System.out.println(jenis);
        System.out.println("No Transaksi: " + noTransaksi + "\n" + "No Resi: " + noResi  + "\n" + "Nama Ekspedisi: " + namaEkspedisi
                + "\n" + "Ongkos Kirim: " + ongkir + "\n" + "Nama Pengirim: " + namaJual + "\n" + "Alamat Pengirim: " + alamatJual
                + "\n" + "Nama Penerima: " + namaBeli + "\n" + "Alamat Penerima: " + alamatBeli);

        System.out.println();
        System.out.println();
    }
    public void strukDrp(){
        System.out.println(jenis);
        System.out.println("No Transaksi: " + noTransaksi + "\n" + "No Resi: " + noResi + "\n" + "Nama Ekspedisi: " + namaEkspedisi
                + "\n" + "Ongkos Kirim: " + ongkir + "\n" + "Nama Pengirim: " + namaDrp + "\n" + "Alamat Pengirim: " + alamatDrp
                + "\n" + "Nama Penerima: " + namaBeli + "\n" + "Alamat Penerima: " + alamatBeli);

        System.out.println();
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

    MarketPlace transaksi1 = new MarketPlace("Asuransi dan Dropship", 1, "N0001", "JNE", 21000, "Udin", "Surabaya","Bejo", "DayeuhKolot", 40000,"Aktif", "DropShip1", "Surabaya", "Aktif");
    transaksi1.strukAsuransiDrp();

    MarketPlace transaksi2 = new MarketPlace("Asuransi", 2, "N0003", "J&T", 16000, "Eiger", "Bandung Kopo", "Tini", "DayeuhKolot", 40000,"Aktif");
    transaksi2.strukAsuransi();

    MarketPlace transaksi3 = new MarketPlace( "Normal", 3, "N0004", "Pos Indonesia", 23000, "Eiger", "Bandung Kopo", "Bambang", "DayeuhKolot");
    transaksi3.strukNormal();

    MarketPlace transaksi4 = new MarketPlace("Dropship", 4, "N0002", "siCepat", 24000, "Asep", "Pontianak", "Joko", "DayeuhKolot", "DropShip2", "Pontianak", "Aktif");
    transaksi4.strukDrp();

    System.out.println();

    }
}

