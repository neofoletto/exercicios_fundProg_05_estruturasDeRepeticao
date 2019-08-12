/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

package code;

import java.util.Scanner;

/**
 * @author neo
 * @create 11/08/2019
 */
public class ex_10 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    double base  = 0;
    int expoente = 0;

    System.out.println("\nPolinômio\n");
    System.out.print("Informe base: ");
    base = imput.nextDouble();
    System.out.print("Informe expoente: ");
    expoente = imput.nextInt();

    System.out.printf("\n%.4f elevada a %d = %.4f", base, expoente, (Math.pow(base, expoente)));
  }
}
