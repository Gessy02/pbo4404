package com.company;

public class Main {

    public static void main(String[] args) {
        ListBuku a = new ListBuku();

        //Menambah buku
        a.tambahBuku(new Buku("1234", "Merawat Kucing", "Rani", "2016", 45000,  4.2));
        a.tambahBuku(new Buku("2233", "Kancil", "Wahyu", "2008", 23000, 4.6));
        a.tambahBuku(new Buku("1111", "Biologi II", "Rahmat", "2017", 89000, 4.5));

        //Menampilkan semua buku
        a.tampilSemua();
        System.out.println();

        //Menampilkan buku sesuai ISBN
        a.cariBuku("1234");
        System.out.println();

        //Mengubah data
        a.gantiJudul("1234", "Kucing" );
        a.gantiPengarang("2233", "Quila");
        a.gantiHarga("1234", 50000);
        a.gantiTahun("1111", "2013");
        a.gantiRate("2233", 4.4);
        System.out.println();

        a.cariBuku("1234");
        a.cariBuku("2233");
        a.cariBuku("1111");

        //Menghapus buku
        a.hapusBuku("1111");

        a.tampilSemua();
    }
}
