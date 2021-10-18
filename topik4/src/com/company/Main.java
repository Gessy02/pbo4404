package com.company;

class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    public Buku (String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    public void setJudul (String judul) {
        this.judul = judul;
    }
    public void setPengarang (String pengarang){
        this.pengarang = pengarang;
    }
    public void setHarga (double harga){
        this.harga = harga;
    }
    public String getJudul(){
        return judul;
    }
    public String getPengarang(){
        return pengarang;
    }
    public double getHarga(){
        return harga;
    }
}
public class Main {

    public static void main(String[] args) {
	Buku book1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
	Buku book2 = new Buku("UML", "Ivar Jacobson", 400000);

	System.out.println("Daftar Buku: ");
	System.out.println();
	System.out.println("Judul : " + book1.getJudul() + "\n" + "Pengarang: " + book1.getPengarang() + "\n" + "Harga: " + book1.getHarga());
	System.out.println();
	System.out.println("Judul : " + book2.getJudul() + "\n" + "Pengarang: " + book2.getPengarang() + "\n" + "Harga: " + book2.getHarga());;

    }
}
