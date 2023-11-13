package semester1.Bada_UtS;

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========== semangat ========");
        System.out.print("Masukkan bilangan dalam basis 1,0: ");
        int decimalNumber = input.nextInt();

        // Mengonversi bilangan dalam basis 10 ke basis 2 dengan perulangan
        String binaryNumber = "";
        int hasilBagi = decimalNumber;

        while (hasilBagi > 0) {
            int remainder = hasilBagi % 2;
            binaryNumber = remainder + binaryNumber;
            hasilBagi = hasilBagi / 2;
        }

        System.out.println("biner dalam basis 2 adalah: " + binaryNumber);
        
    }
}
