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
public class Ex_01 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float nota = -1;

    System.out.println("\nInforme NOTA\n");
    while (nota < 0 || nota > 10) {
      System.out.print("Informe nota (0 até 10): ");
      nota = imput.nextFloat();
      if (nota < 0 || nota > 10)
        nota = imput.nextFloat();
    }

    System.out.println("\nNOTAex");
    System.out.printf("Nota é: %.1f\n", nota);
  }
}
