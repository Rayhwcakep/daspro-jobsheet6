import java.util.Scanner;

public class Pemilihan2Percobaan226 {
    public static void main(String[] args) {
        
        final Scanner input = new Scanner(System.in);

int pilihan_menu;
String member;
double harga, diskon=0.10, total_bayar;
        System.out.println("---------------------");
        System.out.println("====MENU KAFE JTI====");
        System.out.println("---------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan ankga dari menu yang dipilih = ");
        pilihan_menu = input.nextInt();
        input.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
                
            }else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga Ice Tea = " + harga);
                
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga bundling = " + harga);
            }else{
                System.out.println("masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            System.out.println("total bayar setelah diskon = " + total_bayar);
            
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }else {
                System.out.println("Masukkan pilihan dengan benar");
                return;
            }
            System.out.println("total bayar = " + harga);
        } else {
            System.out.println( "member tidak valid");
        }
        System.out.println("----------------------------------------");
    }
    }