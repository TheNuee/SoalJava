package soaljava1;

import java.util.Scanner;

public class SoalJava1 {

    public static void main(String[] args) {
        // Atribut
        int nm, hrg, kd, jml, ttl, Bayar = 0, ulangi, diskon = 0, ulg;
        
        boolean a = true;
        Scanner Scanner = new Scanner(System.in);
        
            System.out.println("Selamat Datang Di Setya ATK Store");
            System.out.println("==================================");
            System.out.print(" Nama Kasir : ");
            String namaKasir = Scanner.next().toUpperCase();
            if (namaKasir == "ADMIN") {
                ulg = 1;
                a = false;
            } else {
                ulg = 0;
            }
            if (ulg == 0) {
                System.out.print(" Nama Kasir : ");
                namaKasir = Scanner.next().toLowerCase();
            }
            System.out.println("==================================");
            do{
            System.out.print(" Nama Barang : ");
            String namaBarang = Scanner.next();
            System.out.print(" Masukkan Jumlah : ");
            jml = Scanner.nextInt();
            System.out.print(" Masukkan Harga : ");
            hrg = Scanner.nextInt();
            ttl = jml * hrg;
            if (ttl > 100000) {
                diskon = (int) (0.10 * ttl);
            }
            else if (ttl >= 200000) {
                diskon = (int) (0.20 * ttl);
            }
            else if (ttl >= 500000){
                diskon = (int) (0.50 * ttl);

            }if (ttl>=100000) {
                Bayar = ttl - diskon;
            }else{
                Bayar=ttl;
            }
            System.out.println("Total Bayar = Rp" + Bayar);

            System.out.println(" ULANG ? ");
            System.out.println("1=YA, 2=TIDAK");
            ulangi = Scanner.nextInt();
        } while (ulangi == 1);
        System.out.println("Terima kasih telah berbelanja di toko kami");
    }
}
