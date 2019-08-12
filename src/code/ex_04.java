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
 * @create 08/08/2019
 */
public class ex_04 {
  public static void main(String[] args) {
    final double CRESCIMENTOA = 0.03;
    final double CRESCIMENTOB = 0.015;

    int cidadeA = 80000;
    int cidadeB = 200000;
    int contAnos = 0;

    while (cidadeA < cidadeB) {
      cidadeA += cidadeA * CRESCIMENTOA;
      cidadeB += cidadeB * CRESCIMENTOB;
      contAnos++;
    }

    System.out.printf("\nA cidade A ultrapassará o número de habitantes da cidade B em %d anos.\n", contAnos);
  }
}
