package com.company;

public class Tetap extends Karyawan {
    private double tuDas;

    public Tetap (String nama, double gaDas, double tuDas){
        super(nama, gaDas);
        this.tuDas = tuDas;
    }
    @Override
    public void displayTetap(){
        System.out.println(this.nama + " " + this.gaDas + " " + this.tuDas);
    }
}
