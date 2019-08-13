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
public class Ex_13 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float num = 0.1f;

    System.out.println("\nFATORIAL\n");
    System.out.print("Informe número inteiro: ");
    num = imput.nextFloat();
    while (num != (int)num)
      num = imput.nextFloat();

    System.out.println("\nResultado:");
    System.out.printf("FAT: %d! = %d\n", (int)num, (int)fat(num));
  }

  private static float fat(float num) {
    if (num <= 1)
      return 1;
    else
      return fat(num - 1) * num;
  }
}
