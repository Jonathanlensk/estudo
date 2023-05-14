import java.util.Scanner;

public class ex0014 {
    public static void main(String[] args) {

        // 0 1 1 2 3 5

        int n1 = 1;
        int n2 = 0;

        System.out.println(n2);

        for (int i = 0; i < 11 ; i++) {
            n1 = n1 + n2;
            n2 = n1 - n2;

            System.out.println(n1);
        }

    }
}
