package dz;

import java.util.Scanner;
public class dz2dop {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int month = in.nextInt();
            int day = in.nextInt();

            int maxdays = 0;

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                maxdays = 31;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxdays = 30;
            } else if (month == 2) {
                maxdays = 28;
            }

            if (month < 1 || month > 12 || day < 1 || day > maxdays) {
                System.out.println(-1);
            } else {
                int nomer = day;

                if (month > 1)  nomer += 31;
                if (month > 2)  nomer += 28;
                if (month > 3)  nomer += 31;
                if (month > 4)  nomer += 30;
                if (month > 5)  nomer += 31;
                if (month > 6)  nomer += 30;
                if (month > 7)  nomer += 31;
                if (month > 8)  nomer += 31;
                if (month > 9)  nomer += 30;
                if (month > 10) nomer += 31;
                if (month > 11) nomer += 30;

                System.out.println(365 - nomer);
            }
        }
    }

