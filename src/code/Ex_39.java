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
 * @create 18/08/2019
 */
public class Ex_39 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num = 0;

    System.out.println("\nINtervalo ao contrário\n");
    System.out.print("Informe número: ");
    num = (int)imput.nextDouble();

    for (int i = 0; i <= num; i++)
      System.out.printf("%d ", i);
    System.out.println();
    for (int i = num; i >= 0; i--)
      System.out.printf("%d ", i);
  }
}
