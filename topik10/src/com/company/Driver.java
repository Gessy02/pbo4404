package com.company;


public class Driver extends Member {
    protected String noPlat;
    protected String jenisKendaraan;

    public Driver(String nama, String nik, String telp, String noPlat, String jenisKendaraan){
        super(nama, nik, telp);
        this.noPlat = noPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    @Override
    public void display(){
        System.out.println("Nama: " + nama + "\n" +
                "NIK: " + nik + "\n" +
                "No. Telepon: " + telp + "\n" +
                "Saldo: " + saldo);
    }
}
