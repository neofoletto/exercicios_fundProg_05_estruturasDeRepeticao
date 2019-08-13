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
public class Ex_25 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double VALOR = 1.99f;

    System.out.println("\nLojas Quase Dois - Tabela de preços\n");
    for (int i = 1; i <= 50; i++)
      System.out.printf("\n%d - R$: %.2f", i, (VALOR * i));
  }
}
