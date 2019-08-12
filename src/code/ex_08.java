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
public class ex_08 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    int soma = 0;

    System.out.println("\nIntervalo sobre números\n");
    System.out.print("Informe número: ");
    num1 = imput.nextInt();
    System.out.print("Informe número: ");
    num2 = imput.nextInt();

    for (int i = num1; i < (num2 + 1); i++) {
      System.out.printf("%d ", i);
      soma += i;
    }
    System.out.printf("\nSoma: %d", soma);
  }
}
