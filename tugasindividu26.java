import java.util.Scanner;

public class tugasindividu26 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        String jenis;
        int jumlah;
        double  totalJumlah, totalDiskon, totalHarga;
        double harga = 20000;
        double diskon = 0;

        System.out.print("Masukkan jenis buku = ");
        jenis = input26.nextLine();
        System.out.print("Masukkan jumlah buku = ");
        jumlah = input26.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {
            System.out.println("Jenis Buku = " + jenis);
            diskon = 0.10;
            if (jumlah > 2) {
                diskon += 0.02;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
            System.out.println("Jenis Buku = " + jenis);
            diskon = 0.07;
            if (jumlah > 3) {
                diskon += 0.02;
            } else if (jumlah <= 3) {
                diskon += 0.01;
            }
        } else {
            System.out.println("Jenis Buku = " + jenis);
            if (jumlah > 3) {
                diskon = 0.05;
            }
        }

        totalJumlah = jumlah * harga;
        totalDiskon = totalJumlah * diskon;
        totalHarga = totalJumlah - totalDiskon;

        System.out.println("Total harga tanpa diskon = " + totalJumlah);
        System.out.println("Jadi total diskonnya adalah = " + totalDiskon);
        System.out.println("Jadi total harganya adalah = " + totalHarga);
    }
}
       