package com.company;

public class Customer extends Member{

    public Customer(String nama, String nik, String telp){
        super(nama, nik, telp);
    }
    @Override
    public void display(){
        System.out.println("Nama: " + nama + "\n" +
                "NIK: " + nik + "\n" +
                "No. Telepon: " + telp + "\n" +
                "Saldo: " + saldo);
    }
}
