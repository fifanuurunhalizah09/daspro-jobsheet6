import java.util.Scanner;

public class Pemilihan2Percobaan209 {

    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        String member, metode_pembayaran;
        int pilihan_menu, jumlah_beli, harga = 0, potongan_Qris = 1000;
        double total_bayar, diskon = 0.1;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input09.nextInt();
        System.out.print("Masukkan Jumlah Beli: ");
        jumlah_beli = input09.nextInt();
        System.out.print("Apakah punya number (y/n)? ");
        member = input09.next(); 
        System.out.println("Masukkan Metode Pembayaran (Tunai/Qris): ");
        metode_pembayaran = input09.next();
        System.out.println("-------------------------------------");

    if (member.equals("y")) {
        diskon = 0.10;
        System.out.println("Besar diskon = 10%");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);

        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);

        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);

        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        total_bayar = harga - (harga * diskon) * jumlah_beli;
        System.out.println("Menu yang pilihan: " + pilihan_menu);
        System.out.println("Total bayar setelah diskon = " + total_bayar);
    if (metode_pembayaran.equals("QRIS")) {
            total_bayar -= 1000;
            System.out.println("Total Bayar QRIS: " + total_bayar);
        }

    } else if (member.equals("n")) {
        System.out.println("Tidak Dapat Diskon");
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }
        total_bayar = harga * jumlah_beli;
        System.out.println("Total bayar = " + harga);

     if (metode_pembayaran.equals("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Total Bayar QRIS: " + total_bayar);
            }
        
        }  
    }
 }

