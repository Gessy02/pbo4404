package com.company;
import java.util.ArrayList;

public class ListBuku {
    ArrayList<Buku> listBuku = new ArrayList<Buku>();

    void tambahBuku(Buku data){
        this.listBuku.add(data);
    }
    void hapusBuku(String isbn){
        this.listBuku.removeIf(item -> item.isbn == isbn);
    }
    void cariBuku(String isbn){
        boolean temu = false;
        int index = -1;
        for(int i=0; i<this.listBuku.size(); i++){
            if (this.listBuku.get(i).isbn == isbn){
                index = i;
                temu = true;
            }
        }
        if (temu == true){
            this.listBuku.get(index).print();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
    void tampilSemua(){
        for(Buku item: this.listBuku){
            item.printAll();
        }
    }
    void gantiJudul(String isbn, String baru){
        int index = -1;
        for(int i=0; i<this.listBuku.size(); i++){
            if (this.listBuku.get(i).isbn == isbn){
                index = i;
            }
        }
        this.listBuku.get(index).judul = baru;
    }
    void gantiPengarang(String isbn, String author){
        int index = -1;
        for(int i=0; i<this.listBuku.size(); i++){
            if (this.listBuku.get(i).isbn == isbn){
                index = i;
            }
        }
        this.listBuku.get(index).pengarang = author;
    }
    void gantiTahun(String isbn, String tahun){
        int index = -1;
        for(int i=0; i<this.listBuku.size(); i++){
            if (this.listBuku.get(i).isbn == isbn){
                index = i;
            }
        }
        this.listBuku.get(index).terbit = tahun;
    }
    void gantiHarga(String isbn, int biaya){
        int index = -1;
        for(int i=0; i<this.listBuku.size(); i++){
            if (this.listBuku.get(i).isbn == isbn){
                index = i;
            }
        }
        this.listBuku.get(index).harga = biaya;
    }
    void gantiRate(String isbn, double rate){
        int index = -1;
        for(int i=0; i<this.listBuku.size(); i++){
            if (this.listBuku.get(i).isbn == isbn){
                index = i;
            }
        }
        this.listBuku.get(index).rating = rate;
    }
}
