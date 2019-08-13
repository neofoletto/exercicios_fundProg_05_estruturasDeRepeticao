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
public class Ex_19 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float num = 0;

    System.out.println("\nNúmero Primo\n");
    System.out.print("Informe número inteiro: ");
    num = imput.nextFloat();
    while (num != (int)num)
      num = imput.nextFloat();

    System.out.println("\nResutaldo");
    for (int i = 1; i <= num; i++)
      if ((i % 2 != 0 && i % 3 != 0 && i != 0)
          || (i == 2 || i == 3)) {
        System.out.printf("%d  ", i);
      }
  }
}
