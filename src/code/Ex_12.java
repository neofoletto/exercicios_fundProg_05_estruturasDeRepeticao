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
public class Ex_12 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num  = 0;
    int fib  = 1;
    int aux1 = 1;
    int aux2 = 0;

    System.out.println("\nFibonacci\n");
    System.out.print("Informe número de termos para série de Fibonacci: ");
    num = imput.nextInt();
    while (num < 0)
      num = imput.nextInt();

    for (int i = 0; i < num; i++) {
      fib = aux1 + aux2;
      aux1 = aux2;
      aux2 = fib;
      System.out.printf("%d, ", fib);
    }
  }
}
