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
public class Ex_20 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float nota  = 0;
    float media = 0;
    int cont    = 1;

    System.out.println("\nMédia de notas");
    System.out.println("\nInforme -1 para sair\n");
    System.out.println("Informe números..");
    while (nota >= 0 && nota <= 10) {
      System.out.printf("\nNota %d: ", cont);
      nota = imput.nextFloat();
      if (nota >= 0 && nota <= 10)
        media += nota;
      cont++;
    }

    media /= cont;

    System.out.println("\nResultado:");
    System.out.printf("Média: %.2f", media);
  }
}

