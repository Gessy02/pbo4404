package com.company;
import java.util.ArrayList;

class Departemen {
    private String nama;
    private ArrayList<Karyawan> kar = new ArrayList<Karyawan>();

    public Departemen(String nama){
        this.nama = nama;
    }
    public void addKaryawan (Karyawan k){
        kar.add(k);
    }
    public void displayAll() {
        System.out.println("Daftar Seluruh Karyawan");
        for(Karyawan item: this.kar){
            item.display();
        }
    }
    public void displayTetap(){
        System.out.println("Daftar Karyawan Tetap");
        for(Karyawan item: this.kar){
            item.displayTetap();
        }
    }
    public void displayKontrak(){
        System.out.println("Daftar Karyawan Kontrak");
        for(Karyawan item: this.kar){
            item.displayKontrak();
        }
    }
}

public class Main {

    public static void main(String[] args) {
	Departemen a = new Departemen("Pegawai");

	Tetap k1 = new Tetap("Childe Ajax", 200000, 50000);
	Tetap k2 = new Tetap("Aether", 500000, 400000);
	Kontrak k3 = new Kontrak("Zhongli", 200000, 3);
	Kontrak k4 = new Kontrak("Lumine", 300000, 4);

	a.addKaryawan(k1);
	a.addKaryawan(k2);
	a.addKaryawan(k3);
	a.addKaryawan(k4);

	a.displayAll();
	System.out.println();
	a.displayTetap();
	System.out.println();
	a.displayKontrak();
	System.out.println();
    }
}
