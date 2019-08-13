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
 * @create 12/08/2019
 */
public class Ex_29 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int base                = 0;
    int multiplicadorInicio = 0;
    int multiplicadorFim    = 0;

    System.out.println("\nTabuada\n");
    System.out.print("Informe base: ");
    base = (int)imput.nextFloat();
    System.out.print("Informe início: ");
    multiplicadorInicio = (int)imput.nextFloat();
    System.out.print("Informe fim: ");
    multiplicadorFim = (int)imput.nextFloat();

    for (int i = multiplicadorInicio; i <= multiplicadorFim; i++)
      System.out.printf("\n%d x %d = %d", base, i, (base * i));
  }
}