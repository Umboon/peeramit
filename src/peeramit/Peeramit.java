/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peeramit;

import java.util.Scanner;

/**
 *
 * @author oom
 */
public class Peeramit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while (a % 2 != 0) {
            a = input.nextInt();
        }
        peeRamit(a);
    }

    private static void peeRamit(final int max) {
        for (int aa = 1; aa < max; aa++) {
            for (int row = 1; row < max - aa; row++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= aa; col++) {
                System.out.print("*");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
