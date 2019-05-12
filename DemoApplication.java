package com.example.demo;


import java.util.Scanner;

public class DemoApplication {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int repat = 2;

        int height = n + 1;

        //draw frist part
        {
            int r1 = n;
            int r2 = n;
            int r3 = n;

            for (int i = 0; i < (height / 2); i++) {

                for (int rep = 0; rep < repat; rep++) {


                    for (int k = 0; k < r1; k++) {
                        System.out.print('-');
                    }

                    for (int k = 0; k < r2; k++) {
                        System.out.print('*');
                    }

                    for (int k = 0; k < r3; k++) {
                        System.out.print('-');
                    }
                    for (int k = 0; k < r2; k++) {
                        System.out.print('*');
                    }

                    for (int k = 0; k < r1; k++) {
                        System.out.print('-');
                    }
                }

                r1--;
                r2 += 2;
                r3 -= 2;

                System.out.println();
            }
        }

        //draw second part
        {
            int r1 = (n - 1) / 2;
            int r2 = n;
            int r3 = 1;
            int r4 = (n * 2) - 1;

            for (int i = 0; i < (height / 2); i++) {

                for (int rep = 0; rep < repat; rep++) {
                    for (int k = 0; k < r1; k++) {
                        System.out.print('-');
                    }

                    for (int k = 0; k < r2; k++) {
                        System.out.print('*');
                    }

                    for (int k = 0; k < r3; k++) {
                        System.out.print('-');
                    }

                    for (int k = 0; k < r4; k++) {
                        System.out.print('*');
                    }

                    for (int k = 0; k < r3; k++) {
                        System.out.print('-');
                    }

                    for (int k = 0; k < r2; k++) {
                        System.out.print('*');
                    }

                    for (int k = 0; k < r1; k++) {
                        System.out.print('-');
                    }
                }

                r1--;
                r3 += 2;
                r4 -= 2;

                System.out.println();
            }
        }


    }

}
