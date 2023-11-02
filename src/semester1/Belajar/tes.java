package semester1.Belajar;

public class  {
    public static void main(String[] args) {
        String perusahaan = "PT. JAVA JAYA - Pembelian Furniture";
        
        String[] kodeProduk = {"A", "B", "C"};
        String[] namaProduk = {"Cupboard", "Computer Desk", "Study Desk"};
        double[] hargaPerUnit = {250000.0, 200000.0, 150000.0};
        double[] diskonPersen = {5.0, 3.0, 2.0};
        
        int jumlahBeli = 20;  // Jumlah unit yang terjual
        
        for (int i = 0; i < kodeProduk.length; i++) {
            double totalHarga = hargaPerUnit[i] * jumlahBeli;
            double besarDiskon = (diskonPersen[i] / 100) * totalHarga;
            double totalBayar = totalHarga - besarDiskon;
            
            String output = "Kode Produk : " + kodeProduk[i] + "\n" +
                            "Nama Produk : " + namaProduk[i] + "\n" +
                            "Harga tiap unit : " + hargaPerUnit[i] + " (Rp)\n" +
                            "Jumlah beli : " + jumlahBeli + "\n" +
                            "Total harga : " + totalHarga + " (Rp)\n" +
                            "Besar Diskon : " + diskonPersen[i] + " %\n" +
                            "Total Diskon : " + besarDiskon + " (Rp)\n" +
                            "Total Bayar : " + totalBayar + " (Rp)\n";
            
            System.out.println(perusahaan);
            System.out.println(output);
            System.out.println();
        }
    }
}
