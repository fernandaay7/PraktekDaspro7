import java.util.Scanner;

/**
 * BioskopDoWhile08
 */
public class BioskopDoWhile08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        int jumlahTiket, pelanggan, hargaTiket = 50000, totalTiket = 0, i = 0;
        double totalHarga = 0, totalPenjualan = 0;

        System.out.println("Masukkan jumlah pelanggan: ");
        pelanggan = sc.nextInt();
        while (i < pelanggan) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + (i + 1) + ":");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi input yang valid!");
                continue;
            }
            totalHarga = jumlahTiket*hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.10;
            }else if (jumlahTiket > 4){
                totalHarga *= 0.15;
            }
            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total harga untuk " + jumlahTiket + "Tiket: Rp." + totalHarga);
            sc.nextLine();
            i++;
        }
        
        System.out.println("Total tiket terjual:" +totalTiket);
        System.out.println("Total penjualan tiket; Rp. " +totalHarga);

    }
}