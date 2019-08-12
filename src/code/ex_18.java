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

public class ex_18 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float num = 0;

    System.out.println("\nNumero Primeo\n");
    System.out.print("Informe número inteiro: ");
    num = imput.nextFloat();
    while (num != (int)num)
      num = imput.nextFloat();

    System.out.println("\nResutaldo");
    if ((num % 2 != 0 && num % 3 != 0 && num != 0)
        || (num == 2 || num == 3))
      System.out.printf("%d é primo", (int)num);
    else {
      System.out.printf("%d não é primo", (int) num);
      System.out.print("\n É apenas divisível por: ");
      for (int i = 1; i <= num; i++)
        if (num % i == 0) {
          if (i != num)
            System.out.printf("%d, ", i);
          else
            System.out.printf("%d", i);
        }
    }
  }
}