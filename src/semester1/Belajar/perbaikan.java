package semester1.Belajar;

import java.util.Scanner;

public class perbaikan {
    double rumusHitung(double tahunproduksi, double pajak, double hargapajak, double pajakTahun) {

        double tahunpajak = tahunproduksi - 2020;
        double penambahanpajak = tahunpajak * pajakTahun;
        double totalpajak = hargapajak * penambahanpajak / 100;

        hargapajak = totalpajak + hargapajak;

        System.out.println(penambahanpajak);
        System.out.println(totalpajak);
        System.out.println(hargapajak);

        return tahunpajak;
    }

    public static void main(String[] args) {
        String jeniskendaraan;
        double kapasitas;
        double hargapajak;
        double tahunproduksi;
        double pajakTahun;

        Scanner input = new Scanner(System.in);

        perbaikan pajak = new perbaikan();

        System.out.println("Silahkan masukan jenis kendaraan anda (1.motor 2.mobil)");
        jeniskendaraan = input.nextLine();
        System.out.println("Masukan kapasitas kendaraan anda (dalam bentuk cc)");
        kapasitas = input.nextInt();
        System.out.println("masukan tahun produksi kendaraan anda");
        tahunproduksi = input.nextInt();

        switch (jeniskendaraan) {
            case "Motor":
                if (kapasitas < 100) {
                    hargapajak = 200000;
                    pajakTahun = 1;

                    pajak.rumusHitung(tahunproduksi, pajakTahun, hargapajak, pajakTahun);

                    // double tahunpajak = pajak.rumusHitung(tahunproduksi, pajakTahun, hargapajak,
                    // pajakTahun);
                    // double penambahanpajak = pajak.rumusHitung(tahunproduksi, pajakTahun,
                    // hargapajak, pajakTahun);

                } else if (kapasitas <= 100 && kapasitas < 250) {
                    hargapajak = 

                }
                break;
        }
    }

}