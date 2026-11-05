import java.util.Scanner;

public class Tugas327 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalPelanggan = 0;
            int totalBarangSemua = 0;
            int tokoTerbanyak = 1;
            int barangTerbanyak = -1;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("Toko " + i);
                int jumlahPelangganToko;
                do {
                    System.out.print("Masukkan jumlah pelanggan: ");
                    jumlahPelangganToko = sc.nextInt();

                    if (jumlahPelangganToko < 0) {
                        System.out.println("Jumlah pelanggan tidak boleh negatif!");
                    }

                } while (jumlahPelangganToko < 0);
                
                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelangganToko; j++) {
                    int jumlahBarang;
                    do {
                        System.out.print("Jumlah barang pelanggan " + j + ": ");

                        jumlahBarang = sc.nextInt();

                        if (jumlahBarang < 0) {
                            System.out.println("Jumlah barang tidak boleh negatif!");
                        }

                    } while (jumlahBarang < 0);

                    totalBarangToko += jumlahBarang;
                }

                totalPelanggan += jumlahPelangganToko;
                totalBarangSemua += totalBarangToko;
          
                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelangganToko + ", total barang: " + totalBarangToko);

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }
            System.out.println("==============================");
            System.out.println("Jumlah toko: " + jumlahToko);
            System.out.println("Total pelanggan seluruh toko: " + totalPelanggan);
            System.out.println("Total barang seluruh toko: " + totalBarangSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}