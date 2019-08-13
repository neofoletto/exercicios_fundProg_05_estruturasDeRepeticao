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
public class Ex_11 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final int TAM = 10;

    double num[] = new double[TAM];
    int par   = 0;
    int impar = 0;

    System.out.println("\nNúmeros pares e ímpares\n");
    System.out.println("Informe 10 números");
    for (int i = 0; i < TAM; i++) {
      System.out.print("Informe numero: ");
      num[i] = imput.nextDouble();
      if (num[i] % 2 == 0)
        par++;
      else
        impar++;
    }

    System.out.println("\nResultado\n");
    System.out.printf("%d número(s) par(es)", par);
    System.out.printf("\n%d número(s) ímpar(es)", impar);
  }
}
