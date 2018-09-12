package soaljava1;

import java.util.Scanner;

public class SoalJava1 {

    public static void main(String[] args) {
        // Atribut
        int nm, hrg, kd, jml, ttl, Bayar = 0, ulangi, diskon = 0;
        Scanner Scanner = new Scanner(System.in);
        do {
            System.out.println("Selamat Datang Di Setya ATK Store");
            System.out.println("==================================");
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
            if (ttl >= 200000) {
                diskon = (int) (0.20 * ttl);
            }
            if (ttl >= 500000) {
                diskon = (int) (0.50 * ttl);

                Bayar = ttl - diskon;
            }
            System.out.println("Total Bayar = Rp" + Bayar);

            System.out.println(" ULANG ? ");
            System.out.println("1=YA, 2=TIDAK");
            ulangi = Scanner.nextInt();
        } while (ulangi == 1);
        System.out.println("Terima kasih telah berbelanja di toko kami");
    }
}
