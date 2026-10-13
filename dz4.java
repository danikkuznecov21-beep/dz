package dz;

import java.util.Scanner;
public class dz4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (a == 0) {
                System.out.println(b > 0 ? "any x" : "no such x");
            } else {
                double r = -b / a;

                if (a > 0) {
                    if (r < 0) {
                        System.out.println("any x");
                    } else {
                        System.out.printf("x<%.1f or x>%.1f%n", -r, r);
                    }
                } else {
                    if (r <= 0) {
                        System.out.println("no such x");
                    } else {
                        System.out.printf("%.1f<x<%.1f%n", -r, r);
                    }
                }
            }
        }
    }

