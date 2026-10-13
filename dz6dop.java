package dz;

import java.util.Scanner;
public class dz6dop {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();


    if (a + b <= c || a + c <= b || b + c <= a) {
        System.out.println("impossible");
    } else {

        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;

        if (c2 >= a2 && c2 >= b2) {

            if (a2 + b2 == c2) System.out.println("right");
            else if (a2 + b2 < c2) System.out.println("obtuse");
            else System.out.println("acute");
        } else if (b2 >= a2 && b2 >= c2) {

            if (a2 + c2 == b2) System.out.println("right");
            else if (a2 + c2 < b2) System.out.println("obtuse");
            else System.out.println("acute");
        } else {

            if (b2 + c2 == a2) System.out.println("right");
            else if (b2 + c2 < a2) System.out.println("obtuse");
            else System.out.println("acute");
        }
    }
}
}

