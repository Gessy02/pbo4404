package com.company;

public class Main {

    public static void main(String[] args) {
        Driver d1 = new Driver("Raihan", "12342", "081928503454", "BP 1221", "Motor");
        Customer c1 = new Customer("Zhongli", "23432","087894341771");
        Driver d2 = new Driver("Athena", "99842", "0823289804454", "BP 1980", "Mobil");
        d1.setSaldoDriver(150000);
        c1.setSaldoCus(250000);

        d1.antar(d1, c1,30000);
        c1.topup(c1, d1,70000);
        d2.antar(d2, c1,50000);

        d1.display();
        System.out.println();
        c1.display();
        d2.display();


    }
}
