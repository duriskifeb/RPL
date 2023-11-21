import java.util.Scanner;

public class mulaiAray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrInt = {1000000};

        for (int i = 0; i < arrInt.length; i++){
            arrInt[i] = i + 1;
            System.out.println(arrInt[i]); 
            return;
        }
    }
}
