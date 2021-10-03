package com.company;

class Barang {
    private String idproduk;
    private String nama;
    private double harga;

    public Barang (String idproduk, String nama, double harga){
        this.idproduk = idproduk;
        this.nama = nama;
        this.harga = harga;
    }
    public Barang (String idproduk, String nama){
        this.idproduk = idproduk;
        this.nama = nama;
    }
    void setNama (String nama){
        this.nama = nama;
    }
    String getNama (){
        return nama;
    }
    void setHarga(double harga){
        this.harga = harga;
    }
    double getHarga(){
        return harga;
    }
    String getIdproduk() {
        return idproduk;
    }
}

public class Main {

    public static void main(String[] args) {
	Barang daftar1 = new Barang ("BRG-001", "Tas Gucci");
	Barang daftar2 = new Barang("BRG-002", "Printer Epson L355");
	Barang daftar3 = new Barang("BRG-003", "Koper", 150);
	Barang daftar4 = new Barang("BRG-004", "Helm", 20);
	daftar1.setHarga(1200);
	daftar2.setHarga(200);

	System.out.println("Total dari barang 1, 3, dan 4 adalah= " + (daftar1.getHarga() + daftar3.getHarga() + daftar4.getHarga()));

    }
}
