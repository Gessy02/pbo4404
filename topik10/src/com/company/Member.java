package com.company;

public class Member {
    protected String nama;
    protected String nik;
    protected String telp;
    protected double saldo;


    public Member(String nama, String nik, String telp){
        this.nama = nama;
        this.nik = nik;
        this.telp = telp;
    }
    public void setSaldoDriver(double saldo){
        this.saldo = saldo;
    }

    public double getSaldoDriver() {
        return saldo;
    }
    public void setSaldoCus(double saldo){
        this.saldo = saldo;
    }

    public double getSaldoCus() {
        return saldo;
    }
    public void topup(Member cus, Member driver,  double bayar){
        Double saldoDriver = driver.getSaldoDriver() - bayar;
        driver.setSaldoDriver(saldoDriver);
        Double saldoCus = cus.getSaldoCus() + bayar;
        cus.setSaldoCus(saldoCus);
    }
    public void antar(Member driver, Member cus, double bayar){
        Double saldoDriver = driver.getSaldoDriver() + bayar;
        driver.setSaldoDriver(saldoDriver);
        Double saldoCus = cus.getSaldoCus() - bayar;
        cus.setSaldoCus(saldoCus);
    }
    public void display(){}
}
