package semester1.SoalAlgoritmaDilkom;

import java.util.Scanner;

public class PerBidangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka : ");
        

        // loooping bersarang !!!
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }

        // System.out.print("\n");

        // for (int i = 0; i < 5; i++){
        //     for (int j = 0; j < 5; j++){
        //         System.out.print(" * ");
        //         if (i == j) {
        //             break;
        //         }
        //     }
        //     System.out.print("\n");
           
        // }

        // System.out.println();

        // for (int i = 0; i < 5; i++){
        //     for (int j = 0; j < 5; j++){
        //         System.out.print(" * ");
        //         if ((i + j) == 4) {
        //             break;
        //         }
        //     }
        //     System.out.print("\n");
        // }

        // System.out.println();

        // for (int i = 0; i < 9; i++){
        //     for (int j = 0; j < 9; j++){
        //         System.out.print(" * ");
        //         if (i == j)  {
        //             break;  
        //         }else if ((i + j) == 8) {
        //             break;
        //         }
        //     }
        //     System.out.print("\n");
        // }

        System.out.println();



    }   
}
