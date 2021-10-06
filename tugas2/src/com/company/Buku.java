package com.company;

public class Buku{
    String isbn;
    String judul;
    String pengarang;
    String terbit;
    int harga;
    double rating;

    Buku(String isbn, String judul, String pengarang, String terbit, int harga, double rating){
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.terbit = terbit;
        this.harga = harga;
        this.rating = rating;
    }
    void printAll(){
        System.out.println("Judul: " + this.judul);
    }
    void print(){
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Judul: " + this.judul);
        System.out.println("Pengarang: " + this.pengarang);
        System.out.println("Tahun Terbit: " + this.terbit);
        System.out.println("Harga: Rp." + this.harga);
        System.out.println("Rating: " + this.rating);
        System.out.println();
    }
}
