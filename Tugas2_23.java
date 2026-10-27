import java.util.Scanner;

public class Tugas2_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi = 1, total = 0;

        do {System.out.println("Program menghitung total parkir");
        System.out.println("Jenis kendaraan: \n1. Mobil\n2. Motor\n0. Keluar");
        System.out.print("Masukkan jenis kendaraan: ");
        jenis = sc.nextInt();

        if (jenis == 1 || jenis == 2) {
            System.out.print("Masukkan durasi parkir :");
            durasi = sc.nextInt();

        } if (jenis ==1) {
            total += durasi * 3000;
        } else if (jenis == 2) {
            total += durasi * 2000;
        }
    }

        while (jenis != 0); 

        System.out.println("Total : " + total);

        sc.close();
    }
}