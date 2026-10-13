package dz;

import java.util.Scanner;
public class dz3dop {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int chislo = in.nextInt();


            if (chislo == 100) {
                System.out.println("C");
            } else {
                int desyatki = chislo / 10;
                int edinicy = chislo % 10;


                if (desyatki == 1) {
                    System.out.print("X");
                } else if (desyatki == 2) {
                    System.out.print("XX");
                } else if (desyatki == 3) {
                    System.out.print("XXX");
                } else if (desyatki == 4) {
                    System.out.print("XL");
                } else if (desyatki == 5) {
                    System.out.print("L");
                } else if (desyatki == 6) {
                    System.out.print("LX");
                } else if (desyatki == 7) {
                    System.out.print("LXX");
                } else if (desyatki == 8) {
                    System.out.print("LXXX");
                } else if (desyatki == 9) {
                    System.out.print("XC");
                }


                if (edinicy == 1) {
                    System.out.print("I");
                } else if (edinicy == 2) {
                    System.out.print("II");
                } else if (edinicy == 3) {
                    System.out.print("III");
                } else if (edinicy == 4) {
                    System.out.print("IV");
                } else if (edinicy == 5) {
                    System.out.print("V");
                } else if (edinicy == 6) {
                    System.out.print("VI");
                } else if (edinicy == 7) {
                    System.out.print("VII");
                } else if (edinicy == 8) {
                    System.out.print("VIII");
                } else if (edinicy == 9) {
                    System.out.print("IX");
                }

                System.out.println();
            }
        }
    }

