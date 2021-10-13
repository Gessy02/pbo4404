package com.company;

import java.util.ArrayList;

    class Jurusan {
    private String kode;
    private String nama;
    private ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

    public Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }
    void addMhs(Mahasiswa m){
        this.mhs.add(m);
    }
    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public ArrayList<Mahasiswa> getMhs() {
        return mhs;
    }
}
    class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
}

public class Main {

    public static void main(String[] args) {

        Jurusan a = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak");
        Mahasiswa s1 = new Mahasiswa("6701", "Rendi");
        Mahasiswa s2 = new Mahasiswa("6702","Chaca");
        Mahasiswa s3 = new Mahasiswa("6703", "Agus");
        a.addMhs(s1);
        a.addMhs(s2);
        a.addMhs(s3);

        Jurusan b = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");
        Mahasiswa m1 = new Mahasiswa("6301", "Ridwan");
        Mahasiswa m2 = new Mahasiswa("6302", "Siska");
        Mahasiswa m3 = new Mahasiswa("6303", "Zayn");
        Mahasiswa m4 = new Mahasiswa("6304", "Rahmat");
        b.addMhs(m1);
        b.addMhs(m2);
        b.addMhs(m3);
        b.addMhs(m4);

        ArrayList<Mahasiswa> list = a.getMhs();
        ArrayList<Mahasiswa> list2 = b.getMhs();

        System.out.println("Kode: " + a.getKode() + "\n" + "Nama: " + a.getNama() + "\n" + "Daftar Mahasiswa: ");
            for(Mahasiswa m:list) {
                System.out.println(m.getNim() + " - " + m.getNama());
            }

        System.out.println();

        System.out.println("Kode: " + b.getKode() + "\n" + "Nama: " + b.getNama() + "\n" + "Daftar Mahasiswa: ");
        for(Mahasiswa n:list2) {
            System.out.println(n.getNim() + " - " + n.getNama());
        }
    }
}
