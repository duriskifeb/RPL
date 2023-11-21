package semester1.Bada_UtS;

import java.util.Scanner;


public class faktorial_rekursif {
    
    static int sum = 1;
}
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 4;
        System.out.print(a + "! = " + faktorial(a)) ;
    }

    public static void cabang (int a) {
        if (a > 0 ) {
            sum *= a;
            a--;
            faktorial_rekursif(a)
        }
        return;
    }
}   
