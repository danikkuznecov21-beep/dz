package dz;

import java.util.Scanner;
public class dz3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tortiki = in.nextInt();

        int a = tortiki % 10;
        int b = tortiki % 100;

        if (b >= 11 && b <= 14) {
            System.out.println(tortiki + " TORTOV");
        } else if ( a== 1) {
            System.out.println(tortiki + " TORT");
        } else if (a >= 2 && a <= 4) {
            System.out.println(tortiki + " TORTA");
        } else {
            System.out.println(tortiki + " TORTOV");
        }
    }
}


