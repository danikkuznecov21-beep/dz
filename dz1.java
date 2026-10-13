package dz;

import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int chislo = in.nextInt();

        if (chislo >= 0 && chislo <= 9) {
            System.out.println("DIGIT");
        } else if (chislo >= 10 && chislo <= 99) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}
