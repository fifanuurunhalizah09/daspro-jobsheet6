import java.util.Scanner;

public class jb6Daspro09 {
    public static void main(String[] args) {
        Scanner input09 = new Scanner(System.in);
        String jenis;
        double diskon = 0;
        double totalBayar, totalDiskon, harga = 20000;
        int jumlahBuku;

        System.out.print("Masukkan Jenis Buku: ");
        jenis = input09.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jumlahBuku = input09.nextInt();

        if (jenis.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
            totalDiskon = diskon * (jumlahBuku*harga);
            totalBayar = (harga * jumlahBuku) - totalDiskon;

            System.out.println("Total diskon: " +totalDiskon);
            System.out.println("Total Bayar: " +totalBayar);
        }
        else if (jenis.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            }else{
                diskon += 0.01;
            }
            totalDiskon = diskon * (jumlahBuku * harga);
            totalBayar = (harga * jumlahBuku) - totalDiskon;

            System.out.println("Total diskon: " +totalDiskon);
            System.out.println("Total Bayar: " +totalBayar);
        }
        else{
            
            if (jumlahBuku > 3) {
                diskon += 0.05;
            }
            totalDiskon = diskon * (jumlahBuku*harga);
            totalBayar = (harga * jumlahBuku) - totalDiskon;

            System.out.println("Total diskon: " +totalDiskon);
            System.out.println("Total Bayar: " +totalBayar);
        }
       
    }
}
