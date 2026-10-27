import java.util.Scanner;
public class Tugas1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalTiket = 0, jumlahTiket, tiket = 50000, hargaBayar, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk keluar): ");
            jumlahTiket = sc.nextDouble();
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi jumlah yang valid!");
                continue;
            }
            if (jumlahTiket == 0) {
                break;
            }

            hargaBayar = jumlahTiket * tiket;

            if (jumlahTiket > 10) {
                hargaBayar = hargaBayar * 0.15;
                System.out.println("Anda mendapat diskon 15%");
            } else if (jumlahTiket > 4) {
                hargaBayar = hargaBayar * 0.1;
                System.out.println("Anda mendapat diskon 10%");
            } else {
                System.out.println("Anda tidak mendapat diskon");
            }

            System.out.println("Total yang harus dibayar: Rp " + hargaBayar);
            totalTiket += jumlahTiket;
            totalPenjualan += hargaBayar;

        }
        
            System.out.println("Total tiket yang terjual: " + totalTiket);
            System.out.println("Total penjualan: Rp " + totalPenjualan);


}
}