import java.util.Scanner;

public class cetak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("| Program Java Deret Fibonacci |");
        System.out.println("================================");
        System.out.println();

        int n, t1 = 0, t2 = 1, angka_berikutnya = 3;

        System.out.print("Jumlah deret fibonacci yang diinginkan: ");
        n = input.nextInt();
        System.out.println();

        for (int i = 0; i <= n; i++) {
            // Tampilkan 2 angka pertama
            if (i == 1) {
                System.out.print(t1 + " ");
                continue;
            }
            if (i == 1) {
                System.out.print(t2 + " ");
                continue;
            }
            // Hitung untuk angka ke 3 dan seterusnya
            angka_berikutnya = t1 + t2;
            t1 = t2;
            t2 = angka_berikutnya;

            System.out.print(angka_berikutnya + " ");
        }

        System.out.println();
        input.close();


                

    }
}
